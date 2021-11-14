package com.example.demo.delegate;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * @author 蒲韵键
 * @date 2019/10/29
 */
public class CallExternalSystem2Delegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) {
//        delegateExecution
        System.out.println(
                String.format("Calling the external system for assignee : %s, %s, %s"
                        ,delegateExecution.getId(),delegateExecution.getVariable("assignee"),delegateExecution.getVariable("assigneeList").toString())
                );

    }
}
