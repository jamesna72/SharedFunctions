import groovy.io.*;
import java.io.*;


def dir = new File("C:\\Azure");
    
new File(dir.path + '\\releasenotes.txt').withWriter('utf-8') 
{ 
	writer -> 
	    dir.eachFileRecurse(FileType.ANY){ file ->
	    if (file.isDirectory()){
		   writer.writeLine(file.name);            
	    }
	    else
	    {
		writer.writeLine('\t' + file.name + '\t' + file.length());
	    }
	} 
}
