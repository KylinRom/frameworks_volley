/*
 * Copyright (C) 2015 The SudaMod Project
 * Copyright (C) 2016 The KylinRom Project  
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kylin.cloud.phone;

public class PhoneInfoBean {

    private String number;
    private String phoneMark;
    private int markType;
    private Long lastUpdateAt;

    public PhoneInfoBean(String number, String phoneMark, Long lastUpdateAt, int markType) {
        super();
        this.number = number;
        this.phoneMark = phoneMark;
        this.lastUpdateAt = lastUpdateAt;
        this.markType = markType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPhoneMark() {
        return phoneMark;
    }

    public void setPhoneMark(String phoneMark) {
        this.phoneMark = phoneMark;
    }

    public Long getLastUpdateAt() {
        return lastUpdateAt;
    }

    public void setLastUpdateAt(Long lastUpdateAt) {
        this.lastUpdateAt = lastUpdateAt;
    }

    public int getMarkType() {
        return markType;
    }

    public void setMarkType(int markType) {
        this.markType = markType;
    }

}

