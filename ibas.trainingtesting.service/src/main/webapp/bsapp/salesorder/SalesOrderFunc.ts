/**
 * @license
 * Copyright color-coding studio. All Rights Reserved.
 *
 * Use of this source code is governed by an Apache License, Version 2.0
 * that can be found in the LICENSE file at http://www.apache.org/licenses/LICENSE-2.0
 */

import * as ibas from "ibas/index";
import { SalesOrderListApp } from "./SalesOrderListApp";

export class SalesOrderFunc extends ibas.ModuleFunction {

    /** 功能标识 */
    static FUNCTION_ID = "abeb6b56-2478-485a-90eb-e1548736d326";
    /** 功能名称 */
    static FUNCTION_NAME = "trainingtesting_func_salesorder";
    /** 构造函数 */
    constructor() {
        super();
        this.id = SalesOrderFunc.FUNCTION_ID;
        this.name = SalesOrderFunc.FUNCTION_NAME;
        this.description = ibas.i18n.prop(this.name);
    }
    /** 默认功能 */
    default(): ibas.IApplication<ibas.IView> {
        let app: SalesOrderListApp = new SalesOrderListApp();
        app.navigation = this.navigation;
        return app;
    }
}
