/*
 * Copyright (c) 2000, 2020, Oracle and/or its affiliates.
 *
 * Licensed under the Universal Permissive License v 1.0 as shown at
 * http://oss.oracle.com/licenses/upl.
 */

package com.tangosol.coherence.reporter.locator;


import com.tangosol.util.aggregator.DoubleSum;
import com.tangosol.util.InvocableMap;

/**
* Sums up numeric values extracted from a set of report locator. All the
* extracted Number objects will be treated as Java <tt>double</tt> values.
*
* @author ew 2008.01.28
* @since Coherence 3.4
*/
public class SumLocator
        extends AggregateLocator
    {
    /**
    * @inheritDoc
    */
    public InvocableMap.EntryAggregator getAggregator()
        {
        return new DoubleSum(m_veColumn);
        }
    }
