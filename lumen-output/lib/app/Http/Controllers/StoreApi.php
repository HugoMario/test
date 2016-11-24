<?php

/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


namespace App\Http\Controllers;

use Illuminate\Support\Facades\Request;

class StoreApi extends Controller
{
    /**
     * Constructor
     */
    public function __construct()
    {
    }

    /**
     * Operation getInventory
     *
     * Returns pet inventories by status.
     *
     *
     * @return Http response
     */
    public function getInventory()
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getInventory as a GET method ?');
    }
    /**
     * Operation placeOrder
     *
     * Place an order for a pet.
     *
     *
     * @return Http response
     */
    public function placeOrder()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['body'])) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling placeOrder');
        }
        $body = $input['body'];


        return response('How about implementing placeOrder as a POST method ?');
    }
    /**
     * Operation deleteOrder
     *
     * Delete purchase order by ID.
     *
     * @param int $order_id ID of the order that needs to be deleted (required)
     *
     * @return Http response
     */
    public function deleteOrder($order_id)
    {
        $input = Request::all();

        //path params validation
        if ($order_id] < 1.0) {
            throw new \InvalidArgumentException('invalid value for $order_id when calling StoreApi.deleteOrder, must be bigger than or equal to 1.0.');
        }


        //not path params validation

        return response('How about implementing deleteOrder as a DELETE method ?');
    }
    /**
     * Operation getOrderById
     *
     * Find purchase order by ID.
     *
     * @param int $order_id ID of pet that needs to be fetched (required)
     *
     * @return Http response
     */
    public function getOrderById($order_id)
    {
        $input = Request::all();

        //path params validation
        if ($order_id] > 10.0) {
            throw new \InvalidArgumentException('invalid value for $order_id when calling StoreApi.getOrderById, must be smaller than or equal to 10.0.');
        }
        if ($order_id] < 1.0) {
            throw new \InvalidArgumentException('invalid value for $order_id when calling StoreApi.getOrderById, must be bigger than or equal to 1.0.');
        }


        //not path params validation

        return response('How about implementing getOrderById as a GET method ?');
    }
}
