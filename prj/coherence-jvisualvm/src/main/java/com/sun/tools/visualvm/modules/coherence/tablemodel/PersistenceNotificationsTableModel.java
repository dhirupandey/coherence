/*
 * Copyright (c) 2000, 2020, Oracle and/or its affiliates.
 *
 * Licensed under the Universal Permissive License v 1.0 as shown at
 * http://oss.oracle.com/licenses/upl.
 */
package com.sun.tools.visualvm.modules.coherence.tablemodel;

import com.sun.tools.visualvm.modules.coherence.tablemodel.model.Data;

/**
 * A model for holding persistence notifications data.
 *
 * @author tam  2015.03.01
 * @since  12.2.1
 */
public class PersistenceNotificationsTableModel
        extends AbstractCoherenceTableModel<Object, Data>
    {
    // ----- constructors ---------------------------------------------------

    /**
     * Creates a table model with the given columns.
     *
     * @param asColumns the columns for this table model
     */
    public PersistenceNotificationsTableModel(String[] asColumns)
        {
        super(asColumns);
        }

    // ----- constants ------------------------------------------------------

    private static final long serialVersionUID = -5255320515776547847L;
    }