/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercepting_filter_pattern;

/**
 *
 * @author MyPC
 */
public class FilterManager {
    FilterChain filterChain;
    
    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarger(target);
    }
    
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }
    
    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
