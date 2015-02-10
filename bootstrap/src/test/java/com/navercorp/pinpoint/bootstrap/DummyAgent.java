/*
 * Copyright 2014 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.bootstrap;

import com.navercorp.pinpoint.bootstrap.Agent;
import com.navercorp.pinpoint.bootstrap.config.ProfilerConfig;
import com.navercorp.pinpoint.bootstrap.context.TraceContext;

import java.lang.instrument.Instrumentation;
import java.net.URL;

/**
 * @author emeroad
 * @author hyungil.jeong
 */
public class DummyAgent implements Agent {

    public DummyAgent(String agentArgs, Instrumentation instrumentation, ProfilerConfig profilerConfig, URL[] pluginJars) {

    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    @Override
    public TraceContext getTraceContext() {
        return null;
    }

    @Override
    public ProfilerConfig getProfilerConfig() {
        return null;
    }

    // @Override
    // public PLoggerBinder initializeLogger() {
    // return new PLoggerBinder() {
    // @Override
    // public PLogger getLogger(String name) {
    // return new DummyPLogger();
    // }
    //
    // @Override
    // public void shutdown() {
    //
    // }
    // };
    // }
}
