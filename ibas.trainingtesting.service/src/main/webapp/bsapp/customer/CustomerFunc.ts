/**
 * @license
 * Copyright color-coding studio. All Rights Reserved.
 *
 * Use of this source code is governed by an Apache License, Version 2.0
 * that can be found in the LICENSE file at http://www.apache.org/licenses/LICENSE-2.0
 */

import * as ibas from "ibas/index";
import { CustomerListApp } from "./CustomerListApp";

export class CustomerFunc extends ibas.ModuleFunction {

    /** 功能标识 */
    static FUNCTION_ID = "33973385-51ef-4cbb-82bb-9b0dbfea7859";
    /** 功能名称 */
    static FUNCTION_NAME = "trainingtesting_func_customer";
    /** 构造函数 */
    constructor() {
        super();
        this.id = CustomerFunc.FUNCTION_ID;
        this.name = CustomerFunc.FUNCTION_NAME;
        this.description = ibas.i18n.prop(this.name);
    }
    /** 默认功能 */
    default(): ibas.IApplication<ibas.IView> {
        let app: CustomerListApp = new CustomerListApp();
        app.navigation = this.navigation;
        return app;
    }
}
