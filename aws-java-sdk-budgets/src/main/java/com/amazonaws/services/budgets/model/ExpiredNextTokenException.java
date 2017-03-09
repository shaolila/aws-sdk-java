/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.budgets.model;

import javax.annotation.Generated;

/**
 * This exception is thrown if the paging token is expired - past its TTL
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExpiredNextTokenException extends com.amazonaws.services.budgets.model.AWSBudgetsException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ExpiredNextTokenException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ExpiredNextTokenException(String message) {
        super(message);
    }

}