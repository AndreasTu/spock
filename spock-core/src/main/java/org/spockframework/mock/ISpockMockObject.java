/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     https://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.spockframework.mock;

import org.spockframework.mock.runtime.IMockInteractionValidator;
import org.spockframework.util.Beta;
import org.spockframework.util.Nullable;

/**
 * MockObject interface implemented by some {@link spock.mock.MockMakers} that allows the {@link org.spockframework.mock.runtime.MockMakerRegistry}
 * to detect mock objects.
 *
 * <p>Not intended for direct use.
 */
public interface ISpockMockObject {

  IMockObject $spock_get();

  /**
   * @return the {@link IMockInteractionValidator} used to verify {@link IMockInteraction}
   * @see IMockInteractionValidator
   * @since 2.4
   */
  @Nullable
  @Beta
  default IMockInteractionValidator $spock_mockInteractionValidator() {
    return null;
  }
}
