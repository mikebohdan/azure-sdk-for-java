/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01.implementation;

import com.microsoft.azure.management.appservice.v2016_03_01.DiagnosticAnalysis;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.appservice.v2016_03_01.AbnormalTimePeriod;
import org.joda.time.DateTime;
import java.util.ArrayList;
import com.microsoft.azure.management.appservice.v2016_03_01.DetectorDefinition;
import com.microsoft.azure.management.appservice.v2016_03_01.AnalysisData;

class DiagnosticAnalysisImpl extends IndexableRefreshableWrapperImpl<DiagnosticAnalysis, DiagnosticAnalysisInner> implements DiagnosticAnalysis {
    private final WebManager manager;
    private String resourceGroupName;
    private String siteName;
    private String diagnosticCategory;
    private String analysisName;

    DiagnosticAnalysisImpl(DiagnosticAnalysisInner inner,  WebManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.siteName = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.diagnosticCategory = IdParsingUtils.getValueFromIdByName(inner.id(), "diagnostics");
        this.analysisName = IdParsingUtils.getValueFromIdByName(inner.id(), "analyses");
    }

    @Override
    public WebManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<DiagnosticAnalysisInner> getInnerAsync() {
        DiagnosticsInner client = this.manager().inner().diagnostics();
        return client.getSiteAnalysisAsync(this.resourceGroupName, this.siteName, this.diagnosticCategory, this.analysisName);
    }



    @Override
    public List<AbnormalTimePeriod> abnormalTimePeriods() {
        return this.inner().abnormalTimePeriods();
    }

    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<DetectorDefinition> nonCorrelatedDetectors() {
        List<DetectorDefinition> lst = new ArrayList<DetectorDefinition>();
        if (this.inner().nonCorrelatedDetectors() != null) {
            for (DetectorDefinitionInner inner : this.inner().nonCorrelatedDetectors()) {
                lst.add( new DetectorDefinitionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public List<AnalysisData> payload() {
        return this.inner().payload();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
