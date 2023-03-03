package org.stage.xss.string;

import com.nhncorp.lucy.security.xss.XssPreventer;
import org.stage.xss.core.spi.XssFilter;
import org.stage.xss.string.exception.StringXssFilteringException;

public class StringXssFilter implements XssFilter{

    private static final String FILTER_NAME = "string";

    public StringXssFilter(){}

    @Override
    public String getFilterName(){
        return FILTER_NAME;
    }

    @Override
    public <P> P doFilter(Object dirty, Class<P> cast){
        try{
            return cast.cast(XssPreventer.escape(dirty.toString()));
        } catch (Exception e){
            throw new StringXssFilteringException(dirty.getClass().getSimpleName());
        }
    }

}
