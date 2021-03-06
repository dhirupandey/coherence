/*
 * Copyright (c) 2000, 2020, Oracle and/or its affiliates.
 *
 * Licensed under the Universal Permissive License v 1.0 as shown at
 * http://oss.oracle.com/licenses/upl.
 */

package com.tangosol.io;


import com.tangosol.io.pof.ConfigurablePofContext;
import com.tangosol.io.pof.schema.annotation.PortableType;

import common.AbstractFunctionalTest;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link ConfigurablePofContext} auto-generation POF Config for {@link PortableType}.
 *
 * @author tam  2020.08.21
 */
public class PortableTypeTests
    extends AbstractPortableTypeTests
    {

    // ----- constructors ---------------------------------------------------

    /**
    * Default constructor.
    */
    public PortableTypeTests()
        {
        super(getCacheConfig());
        }

    // ----- test lifecycle -------------------------------------------------

    @Before
    public void setup()
        {
        System.setProperty("coherence.distributed.localstorage", "true");
        System.setProperty("coherence.pof.enabled", "true");
        System.setProperty("coherence.log.level", "9");
        AbstractFunctionalTest._startup();
        }

    /**
     * This test validates that classes annotated with PortableType can be
     * used with POF without creating a pof config file.
     */
    @Test
    public void testGenericPortableTypes()
        {
        runTest();
        }
   }
