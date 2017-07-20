package org.colorcoding.ibas.trainingtesting.repository;

import org.colorcoding.ibas.bobas.common.*;
import org.colorcoding.ibas.bobas.repository.*;
import org.colorcoding.ibas.trainingtesting.bo.material.*;
import org.colorcoding.ibas.trainingtesting.bo.customer.*;
import org.colorcoding.ibas.trainingtesting.bo.salesorder.*;

/**
* TrainingTesting仓库服务
*/
public interface IBORepositoryTrainingTestingSvc extends IBORepositorySmartService {


    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-物料主数据
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    OperationResult<Material> fetchMaterial(ICriteria criteria, String token);

    /**
     * 保存-物料主数据
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    OperationResult<Material> saveMaterial(Material bo, String token);

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-客户主数据
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    OperationResult<Customer> fetchCustomer(ICriteria criteria, String token);

    /**
     * 保存-客户主数据
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    OperationResult<Customer> saveCustomer(Customer bo, String token);

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-销售订单
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    OperationResult<SalesOrder> fetchSalesOrder(ICriteria criteria, String token);

    /**
     * 保存-销售订单
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    OperationResult<SalesOrder> saveSalesOrder(SalesOrder bo, String token);

    //--------------------------------------------------------------------------------------------//

}
