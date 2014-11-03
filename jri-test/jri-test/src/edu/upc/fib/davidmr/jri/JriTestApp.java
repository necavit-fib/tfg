package edu.upc.fib.davidmr.jri;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.RVector;
import org.rosuda.JRI.Rengine;

public class JriTestApp {

	public static void main(String [] args) {
		
		System.out.println("===============================");
		System.out.println(System.getProperty("java.library.path"));
		System.out.println("===============================");
		
        Rengine rEngine = new Rengine (new String [] {"--vanilla"}, false, null);
        System.out.println("Rengine created...");
		if (!rEngine.waitForR()) {
            System.out.println("Cannot load R");
            return;
        }
		
        rEngine.eval("foo <- 123");
        REXP result = rEngine.eval("foo");
        System.out.println(result.asInt());
        
        System.out.println("===============================");
        System.out.println("Loading sdcMicro...");
        REXP lib = rEngine.eval("library(sdcMicro)");
        System.out.println(lib.getType()); //after looking up the javadoc -> String[]
        String [] libResults = lib.asStringArray();
        for (String s : libResults) {
        	System.out.println(s);
        }
        System.out.println("===============================");
        System.out.println("Using sdcMicro:");
        
        System.out.println("  " + "Loading 'Tarragona' dataset...");
        rEngine.eval("data(Tarragona)");
        
        REXP tarragona = rEngine.eval("Tarragona");
        RVector tvec = tarragona.asVector();
        for (int i = 0; i < tvec.size(); ++i) {
        	System.out.print("  " + REXP.xtName(tvec.at(i).getType()));
        }
        System.out.println("");
        
        System.out.println("  " + "Performing microaggregation...");
        rEngine.eval("m1 <- microaggregation(Tarragona, method='pca')");
        
        /*
        System.out.println("  " + "Summarizing microaggregated data...");
        REXP microSummary = rEngine.eval("summary(m1)");
        System.out.println("  " + microSummary.toString());
        */
        
        REXP microaggregated = rEngine.eval("m1");
        RVector rvec = microaggregated.asVector();
        for (int i = 0; i < rvec.size(); ++i) {
        	System.out.print("  " + REXP.xtName(rvec.at(i).getType()));
        }
        System.out.println("");
        
        for (Object s : rvec.getNames()) {
        	System.out.print("  " + s);
        }
        System.out.println("");
        
        System.out.println("===============================");
	}
	
}
