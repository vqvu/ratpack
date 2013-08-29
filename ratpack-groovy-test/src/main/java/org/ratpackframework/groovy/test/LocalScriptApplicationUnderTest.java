/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ratpackframework.groovy.test;

import org.ratpackframework.groovy.launch.RatpackMain;
import org.ratpackframework.test.ServerBackedApplicationUnderTest;

public class LocalScriptApplicationUnderTest extends ServerBackedApplicationUnderTest {

  public LocalScriptApplicationUnderTest() {
    super(new RatpackMainServerFactory());
  }

  public TestHttpClient httpClient() {
    return TestHttpClients.testHttpClient(this);
  }

  private static class RatpackMainServerFactory extends org.ratpackframework.test.RatpackMainServerFactory {
    public RatpackMainServerFactory() {
      super(new RatpackMain());
    }
  }
}