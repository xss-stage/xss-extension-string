package org.stage.xss.string.exception;

public final class StringXssFilteringException extends RuntimeException{

    public StringXssFilteringException(String target){
        super("Cannot filtering \"" + target + "\"");
    }

}
