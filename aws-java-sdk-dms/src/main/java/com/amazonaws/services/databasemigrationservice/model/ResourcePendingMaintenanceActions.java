/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifies an AWS DMS resource and any pending actions for it.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ResourcePendingMaintenanceActions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourcePendingMaintenanceActions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DMS resource that the pending maintenance action applies to. For
     * information about creating an ARN, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Introduction.AWS.ARN.html"> Constructing an Amazon
     * Resource Name (ARN) for AWS DMS</a> in the DMS documentation.
     * </p>
     */
    private String resourceIdentifier;
    /**
     * <p>
     * Detailed information about the pending maintenance action.
     * </p>
     */
    private java.util.List<PendingMaintenanceAction> pendingMaintenanceActionDetails;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DMS resource that the pending maintenance action applies to. For
     * information about creating an ARN, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Introduction.AWS.ARN.html"> Constructing an Amazon
     * Resource Name (ARN) for AWS DMS</a> in the DMS documentation.
     * </p>
     * 
     * @param resourceIdentifier
     *        The Amazon Resource Name (ARN) of the DMS resource that the pending maintenance action applies to. For
     *        information about creating an ARN, see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Introduction.AWS.ARN.html"> Constructing an
     *        Amazon Resource Name (ARN) for AWS DMS</a> in the DMS documentation.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DMS resource that the pending maintenance action applies to. For
     * information about creating an ARN, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Introduction.AWS.ARN.html"> Constructing an Amazon
     * Resource Name (ARN) for AWS DMS</a> in the DMS documentation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the DMS resource that the pending maintenance action applies to. For
     *         information about creating an ARN, see <a
     *         href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Introduction.AWS.ARN.html"> Constructing an
     *         Amazon Resource Name (ARN) for AWS DMS</a> in the DMS documentation.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DMS resource that the pending maintenance action applies to. For
     * information about creating an ARN, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Introduction.AWS.ARN.html"> Constructing an Amazon
     * Resource Name (ARN) for AWS DMS</a> in the DMS documentation.
     * </p>
     * 
     * @param resourceIdentifier
     *        The Amazon Resource Name (ARN) of the DMS resource that the pending maintenance action applies to. For
     *        information about creating an ARN, see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Introduction.AWS.ARN.html"> Constructing an
     *        Amazon Resource Name (ARN) for AWS DMS</a> in the DMS documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePendingMaintenanceActions withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * Detailed information about the pending maintenance action.
     * </p>
     * 
     * @return Detailed information about the pending maintenance action.
     */

    public java.util.List<PendingMaintenanceAction> getPendingMaintenanceActionDetails() {
        return pendingMaintenanceActionDetails;
    }

    /**
     * <p>
     * Detailed information about the pending maintenance action.
     * </p>
     * 
     * @param pendingMaintenanceActionDetails
     *        Detailed information about the pending maintenance action.
     */

    public void setPendingMaintenanceActionDetails(java.util.Collection<PendingMaintenanceAction> pendingMaintenanceActionDetails) {
        if (pendingMaintenanceActionDetails == null) {
            this.pendingMaintenanceActionDetails = null;
            return;
        }

        this.pendingMaintenanceActionDetails = new java.util.ArrayList<PendingMaintenanceAction>(pendingMaintenanceActionDetails);
    }

    /**
     * <p>
     * Detailed information about the pending maintenance action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPendingMaintenanceActionDetails(java.util.Collection)} or
     * {@link #withPendingMaintenanceActionDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param pendingMaintenanceActionDetails
     *        Detailed information about the pending maintenance action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePendingMaintenanceActions withPendingMaintenanceActionDetails(PendingMaintenanceAction... pendingMaintenanceActionDetails) {
        if (this.pendingMaintenanceActionDetails == null) {
            setPendingMaintenanceActionDetails(new java.util.ArrayList<PendingMaintenanceAction>(pendingMaintenanceActionDetails.length));
        }
        for (PendingMaintenanceAction ele : pendingMaintenanceActionDetails) {
            this.pendingMaintenanceActionDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Detailed information about the pending maintenance action.
     * </p>
     * 
     * @param pendingMaintenanceActionDetails
     *        Detailed information about the pending maintenance action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePendingMaintenanceActions withPendingMaintenanceActionDetails(java.util.Collection<PendingMaintenanceAction> pendingMaintenanceActionDetails) {
        setPendingMaintenanceActionDetails(pendingMaintenanceActionDetails);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getPendingMaintenanceActionDetails() != null)
            sb.append("PendingMaintenanceActionDetails: ").append(getPendingMaintenanceActionDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourcePendingMaintenanceActions == false)
            return false;
        ResourcePendingMaintenanceActions other = (ResourcePendingMaintenanceActions) obj;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getPendingMaintenanceActionDetails() == null ^ this.getPendingMaintenanceActionDetails() == null)
            return false;
        if (other.getPendingMaintenanceActionDetails() != null
                && other.getPendingMaintenanceActionDetails().equals(this.getPendingMaintenanceActionDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPendingMaintenanceActionDetails() == null) ? 0 : getPendingMaintenanceActionDetails().hashCode());
        return hashCode;
    }

    @Override
    public ResourcePendingMaintenanceActions clone() {
        try {
            return (ResourcePendingMaintenanceActions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.ResourcePendingMaintenanceActionsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
