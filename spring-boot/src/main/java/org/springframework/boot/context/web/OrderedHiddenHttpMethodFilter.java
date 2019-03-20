/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.context.web;

import org.springframework.core.Ordered;
import org.springframework.web.filter.HiddenHttpMethodFilter;

/**
 * {@link HiddenHttpMethodFilter} that also implements {@link Ordered}.
 *
 * @author Phillip Webb
 * @since 1.2.4
 * @deprecated as of 1.4 in favor of
 * {@link org.springframework.boot.web.filter.OrderedHiddenHttpMethodFilter}
 */
@Deprecated
public class OrderedHiddenHttpMethodFilter
		extends org.springframework.boot.web.filter.OrderedHiddenHttpMethodFilter {

	/**
	 * The default order is high to ensure the filter is applied before Spring Security.
	 */
	public static final int DEFAULT_ORDER = org.springframework.boot.web.filter.OrderedHiddenHttpMethodFilter.DEFAULT_ORDER;

}
