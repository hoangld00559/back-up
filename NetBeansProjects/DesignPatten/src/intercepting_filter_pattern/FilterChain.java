/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercepting_filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MyPC
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    private Target target;
    
    public void addFilter(Filter filter){
        filters.add(filter);
    }
    
    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }
    
    public void setTarger(Target target){
        this.target = target;
    }
}
