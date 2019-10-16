/*
 * Copyright (c) 2018-2019 Qualcomm Technologies, Inc.
 * All rights reserved.
 * Redistribution and use in source and binary forms, with or without modification, are permitted (subject to the limitations in the disclaimer below) provided that the following conditions are met:
 *  Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *  Neither the name of Qualcomm Technologies, Inc. nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 *  The origin of this software must not be misrepresented; you must not claim that you wrote the original software. If you use this software in a product, an acknowledgment is required by displaying the trademark/log as per the details provided here: [https://www.qualcomm.com/documents/dirbs-logo-and-brand-guidelines]
 *  Altered source versions must be plainly marked as such, and must not be misrepresented as being the original software.
 *  This notice may not be removed or altered from any source distribution.
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.qualcomm.dvspublic.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Compliant extends BaseObservable implements Serializable {

    @SerializedName("link_to_help")
    private String linkToHelp;

    @SerializedName("block_date")
    private String blockDate;

    @SerializedName("inactivity_reasons")
    private List<String> inactivityReasons;

    @SerializedName("status")
    private String status;

    private String reason = "N/A";

    public void setLinkToHelp(String linkToHelp) {
        this.linkToHelp = linkToHelp;
    }

    @Bindable
    public String getLinkToHelp() {
        return linkToHelp;
    }

    public void setBlockDate(String blockDate) {
        this.blockDate = blockDate;
    }

    @Bindable
    public String getBlockDate() {
        return blockDate;
    }

    public void setInactivityReasons(List<String> inactivityReasons) {
        this.inactivityReasons = inactivityReasons;
    }

    @Bindable
    public List<String> getInactivityReasons() {
        return inactivityReasons;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        if (inactivityReasons != null) {
            for (int i = 0; i < inactivityReasons.size(); i++) {
                if (i == 0) {
                    reason = inactivityReasons.get(i);
                } else {
                    reason = reason + ", " + inactivityReasons.get(i);
                }
            }
        } else {
            reason = "N/A";
        }
        return reason;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Bindable
    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return
                "Compliant{" +
                        "link_to_help = '" + linkToHelp + '\'' +
                        ",block_date = '" + blockDate + '\'' +
                        ",inactivity_reasons = '" + inactivityReasons + '\'' +
                        ",status = '" + status + '\'' +
                        "}";
    }
}