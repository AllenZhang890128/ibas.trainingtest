package org.colorcoding.ibas.trainingtesting.repository;

import org.colorcoding.ibas.bobas.common.*;
import org.colorcoding.ibas.bobas.repository.*;
import org.colorcoding.ibas.trainingtesting.bo.material.*;
import org.colorcoding.ibas.trainingtesting.bo.customer.*;
import org.colorcoding.ibas.trainingtesting.bo.salesorder.*;

/**
* TrainingTesting仓库应用
*/
public interface IBORepositoryTrainingTestingApp extends IBORepositoryApplication {

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-物料主数据
     * @param criteria 查询
     * @return 操作结果
     */
    IOperationResult<IMaterial> fetchMaterial(ICriteria criteria);

    /**
     * 保存-物料主数据
     * @param bo 对象实例
     * @return 操作结果
     */
    IOperationResult<IMaterial> saveMaterial(IMaterial bo);

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-客户主数据
     * @param criteria 查询
     * @return 操作结果
     */
    IOperationResult<ICustomer> fetchCustomer(ICriteria criteria);

    /**
     * 保存-客户主数据
     * @param bo 对象实例
     * @return 操作结果
     */
    IOperationResult<ICustomer> saveCustomer(ICustomer bo);

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-销售订单
     * @param criteria 查询
     * @return 操作结果
     */
    IOperationResult<ISalesOrder> fetchSalesOrder(ICriteria criteria);

    /**
     * 保存-销售订单
     * @param bo 对象实例
     * @return 操作结果
     */
    IOperationResult<ISalesOrder> saveSalesOrder(ISalesOrder bo);

    //--------------------------------------------------------------------------------------------//

}
