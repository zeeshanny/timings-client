package com.kevingann.beans.cicd.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Flags {

    @JsonProperty("assertBaseline")
    private Boolean assertBaseline;

    @JsonProperty("debug")
    private Boolean debug;

    @JsonProperty("esTrace")
    private Boolean esTrace;

    @JsonProperty("esCreate")
    private Boolean esCreate;

    @JsonProperty("passOnFailedAssert")
    private Boolean passOnFailedAssert;

    public Flags(Builder builder) {
        this.assertBaseline = builder.assertBaseline;
        this.debug = builder.debug;
        this.esTrace = builder.esTrace;
        this.esCreate = builder.esCreate;
        this.passOnFailedAssert = builder.passOnFailedAssert;
    }

    public static class Builder {
        private Boolean assertBaseline;
        private Boolean debug;
        private Boolean esTrace;
        private Boolean esCreate;
        private Boolean passOnFailedAssert;

        public Builder assertBaseline(Boolean assertBaseline) {
            this.assertBaseline = assertBaseline;
            return this;
        }

        public Builder debug(Boolean debug) {
            this.debug = debug;
            return this;
        }

        public Builder esTrace(Boolean esTrace) {
            this.esTrace = esTrace;
            return this;
        }

        public Builder esCreate(Boolean esCreate) {
            this.esCreate = esCreate;
            return this;
        }

        public Builder passOnFailedAssert(Boolean passOnFailedAssert) {
            this.passOnFailedAssert = passOnFailedAssert;
            return this;
        }

        public Flags build() {
            return new Flags(this);
        }

    }

    public Boolean isAssertBsaeline() {
        return assertBaseline;
    }

    public Boolean isDebug() {
        return debug;
    }

    public Boolean isEsTrace() {
        return esTrace;
    }

    public Boolean isEsCreate() {
        return esCreate;
    }

    public Boolean isPassOnFailedAssert() {
        return passOnFailedAssert;
    }

    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
    }
}
