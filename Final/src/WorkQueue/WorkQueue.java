/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkQueue;
import java.util.ArrayList;


/**
 *
 * @author xutao
 */
public class WorkQueue {
    
    private ArrayList <WorkRequest>  workqueue;
    
    public WorkQueue() {
        this.workqueue = new ArrayList<> ();
        
    }

    public ArrayList<WorkRequest> getWorkqueue() {
        return workqueue;
    }
    
    public void AddWorkrequest(WorkRequest workRequest) {
        this.workqueue.add(workRequest);
    }
    
}
