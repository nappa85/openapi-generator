/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.google.gson.annotations.SerializedName

/**
* 
* Values: abc,minusEfg,leftParenthesisXyzRightParenthesis
*/

enum class EnumClass(val value: kotlin.String){


    @SerializedName(value = "_abc")
    abc("_abc"),


    @SerializedName(value = "-efg")
    minusEfg("-efg"),


    @SerializedName(value = "(xyz)")
    leftParenthesisXyzRightParenthesis("(xyz)");



	/**
	This override toString avoids using the enum var name and uses the actual api value instead.
	In cases the var name and value are different, the client would send incorrect enums to the server.
	**/
	override fun toString(): String {
        return value
    }

}

