package org.colorcoding.ibas.trainingtesting.service.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.colorcoding.ibas.bobas.common.*;
import org.colorcoding.ibas.trainingtesting.repository.*;
import org.colorcoding.ibas.trainingtesting.bo.material.*;
import org.colorcoding.ibas.trainingtesting.bo.customer.*;
import org.colorcoding.ibas.trainingtesting.bo.salesorder.*;

/**
* TrainingTesting 数据服务JSON
*/
@Path("data")
public class DataService extends BORepositoryTrainingTesting {

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-物料主数据
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("fetchMaterial")
    public OperationResult<Material> fetchMaterial(Criteria criteria, @QueryParam("token") String token) {
        return super.fetchMaterial(criteria, token);
    }

    /**
     * 保存-物料主数据
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("saveMaterial")
    public OperationResult<Material> saveMaterial(Material bo, @QueryParam("token") String token) {
        return super.saveMaterial(bo, token);
    }

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-客户主数据
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("fetchCustomer")
    public OperationResult<Customer> fetchCustomer(Criteria criteria, @QueryParam("token") String token) {
        return super.fetchCustomer(criteria, token);
    }

    /**
     * 保存-客户主数据
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("saveCustomer")
    public OperationResult<Customer> saveCustomer(Customer bo, @QueryParam("token") String token) {
        return super.saveCustomer(bo, token);
    }

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-销售订单
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("fetchSalesOrder")
    public OperationResult<SalesOrder> fetchSalesOrder(Criteria criteria, @QueryParam("token") String token) {
        return super.fetchSalesOrder(criteria, token);
    }

    /**
     * 保存-销售订单
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("saveSalesOrder")
    public OperationResult<SalesOrder> saveSalesOrder(SalesOrder bo, @QueryParam("token") String token) {
        return super.saveSalesOrder(bo, token);
    }

    //--------------------------------------------------------------------------------------------//

}
