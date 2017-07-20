package org.colorcoding.ibas.trainingtesting.test.bo;

import junit.framework.TestCase;
import org.colorcoding.ibas.bobas.data.*;
import org.colorcoding.ibas.bobas.common.*;
import org.colorcoding.ibas.bobas.repository.*;
import org.colorcoding.ibas.trainingtesting.data.*;
import org.colorcoding.ibas.trainingtesting.bo.customer.*;
import org.colorcoding.ibas.trainingtesting.repository.*;

/**
* 客户主数据 测试
* 
*/
public class testCustomer extends TestCase {
    /**
     * 获取连接口令
    */
    String getToken() {
        return "";
    }
    
    /**
     * 基本项目测试
     * @throws Exception 
    */
    public void testBasicItems() throws Exception {
        Customer bo = new Customer();
        // 测试属性赋值


        // 测试对象的保存和查询
        IOperationResult<?> operationResult = null;
        ICriteria criteria = null;
        IBORepositoryTrainingTestingApp boRepository = new BORepositoryTrainingTesting();
        //设置用户口令
        boRepository.setUserToken(this.getToken());

        // 测试保存
        operationResult = boRepository.saveCustomer(bo);
        assertEquals(operationResult.getMessage(), operationResult.getResultCode(), 0);
        Customer boSaved = (Customer)operationResult.getResultObjects().firstOrDefault();


        // 测试查询
        criteria = boSaved.getCriteria();
        criteria.setResultCount(10);
        operationResult = boRepository.fetchCustomer(criteria);
        assertEquals(operationResult.getMessage(), operationResult.getResultCode(), 0);


    }

}
