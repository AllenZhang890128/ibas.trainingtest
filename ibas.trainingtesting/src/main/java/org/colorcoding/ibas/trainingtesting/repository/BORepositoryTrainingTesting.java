package org.colorcoding.ibas.trainingtesting.repository;

import org.colorcoding.ibas.bobas.common.*;
import org.colorcoding.ibas.bobas.ownership.*;
import org.colorcoding.ibas.bobas.repository.*;
import org.colorcoding.ibas.trainingtesting.bo.material.*;
import org.colorcoding.ibas.trainingtesting.bo.customer.*;
import org.colorcoding.ibas.trainingtesting.bo.salesorder.*;

/**
* TrainingTesting仓库
*/
@PermissionGroup("TrainingTesting")
public class BORepositoryTrainingTesting extends BORepositoryServiceApplication implements IBORepositoryTrainingTestingSvc, IBORepositoryTrainingTestingApp {

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-物料主数据
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    public OperationResult<Material> fetchMaterial(ICriteria criteria, String token) {
        return super.fetch(criteria, token, Material.class);
    }

    /**
     * 查询-物料主数据（提前设置用户口令）
     * @param criteria 查询
     * @return 操作结果
     */
    public IOperationResult<IMaterial> fetchMaterial(ICriteria criteria) {
        return new OperationResult<IMaterial>(this.fetchMaterial(criteria, this.getUserToken()));
    }

    /**
     * 保存-物料主数据
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    public OperationResult<Material> saveMaterial(Material bo, String token) {
        return super.save(bo, token);
    }

    /**
     * 保存-物料主数据（提前设置用户口令）
     * @param bo 对象实例
     * @return 操作结果
     */
    public IOperationResult<IMaterial> saveMaterial(IMaterial bo) {
        return new OperationResult<IMaterial>(this.saveMaterial((Material) bo, this.getUserToken()));
    }

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-客户主数据
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    public OperationResult<Customer> fetchCustomer(ICriteria criteria, String token) {
        return super.fetch(criteria, token, Customer.class);
    }

    /**
     * 查询-客户主数据（提前设置用户口令）
     * @param criteria 查询
     * @return 操作结果
     */
    public IOperationResult<ICustomer> fetchCustomer(ICriteria criteria) {
        return new OperationResult<ICustomer>(this.fetchCustomer(criteria, this.getUserToken()));
    }

    /**
     * 保存-客户主数据
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    public OperationResult<Customer> saveCustomer(Customer bo, String token) {
        return super.save(bo, token);
    }

    /**
     * 保存-客户主数据（提前设置用户口令）
     * @param bo 对象实例
     * @return 操作结果
     */
    public IOperationResult<ICustomer> saveCustomer(ICustomer bo) {
        return new OperationResult<ICustomer>(this.saveCustomer((Customer) bo, this.getUserToken()));
    }

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-销售订单
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    public OperationResult<SalesOrder> fetchSalesOrder(ICriteria criteria, String token) {
        return super.fetch(criteria, token, SalesOrder.class);
    }

    /**
     * 查询-销售订单（提前设置用户口令）
     * @param criteria 查询
     * @return 操作结果
     */
    public IOperationResult<ISalesOrder> fetchSalesOrder(ICriteria criteria) {
        return new OperationResult<ISalesOrder>(this.fetchSalesOrder(criteria, this.getUserToken()));
    }

    /**
     * 保存-销售订单
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    public OperationResult<SalesOrder> saveSalesOrder(SalesOrder bo, String token) {
        return super.save(bo, token);
    }

    /**
     * 保存-销售订单（提前设置用户口令）
     * @param bo 对象实例
     * @return 操作结果
     */
    public IOperationResult<ISalesOrder> saveSalesOrder(ISalesOrder bo) {
        return new OperationResult<ISalesOrder>(this.saveSalesOrder((SalesOrder) bo, this.getUserToken()));
    }

    //--------------------------------------------------------------------------------------------//

}
