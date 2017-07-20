package org.colorcoding.ibas.trainingtesting.service.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.colorcoding.ibas.bobas.common.*;
import org.colorcoding.ibas.bobas.cxf.WebServicePath;
import org.colorcoding.ibas.trainingtesting.repository.*;
import org.colorcoding.ibas.trainingtesting.bo.material.*;
import org.colorcoding.ibas.trainingtesting.bo.customer.*;
import org.colorcoding.ibas.trainingtesting.bo.salesorder.*;

/**
* TrainingTesting 数据服务JSON
*/
@WebService
@WebServicePath("data")
public class DataService extends BORepositoryTrainingTesting {

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-物料主数据
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    @WebMethod
    public OperationResult<Material> fetchMaterial(@WebParam(name = "criteria") Criteria criteria, @WebParam(name = "token") String token) {
        return super.fetchMaterial(criteria, token);
    }

    /**
     * 保存-物料主数据
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    @WebMethod
    public OperationResult<Material> saveMaterial(@WebParam(name = "bo") Material bo, @WebParam(name = "token") String token) {
        return super.saveMaterial(bo, token);
    }

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-客户主数据
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    @WebMethod
    public OperationResult<Customer> fetchCustomer(@WebParam(name = "criteria") Criteria criteria, @WebParam(name = "token") String token) {
        return super.fetchCustomer(criteria, token);
    }

    /**
     * 保存-客户主数据
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    @WebMethod
    public OperationResult<Customer> saveCustomer(@WebParam(name = "bo") Customer bo, @WebParam(name = "token") String token) {
        return super.saveCustomer(bo, token);
    }

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-销售订单
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    @WebMethod
    public OperationResult<SalesOrder> fetchSalesOrder(@WebParam(name = "criteria") Criteria criteria, @WebParam(name = "token") String token) {
        return super.fetchSalesOrder(criteria, token);
    }

    /**
     * 保存-销售订单
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    @WebMethod
    public OperationResult<SalesOrder> saveSalesOrder(@WebParam(name = "bo") SalesOrder bo, @WebParam(name = "token") String token) {
        return super.saveSalesOrder(bo, token);
    }

    //--------------------------------------------------------------------------------------------//

}
