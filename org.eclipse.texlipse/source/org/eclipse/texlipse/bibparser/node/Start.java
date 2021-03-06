/*******************************************************************************
 * Copyright (c) 2017 the TeXlipse team and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     The TeXlipse team - initial API and implementation
 *******************************************************************************/
/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.eclipse.texlipse.bibparser.node;

import org.eclipse.texlipse.bibparser.analysis.*;

@SuppressWarnings("nls")
public final class Start extends Node
{
    private PBibtex _pBibtex_;
    private EOF _eof_;

    public Start()
    {
        // Empty body
    }

    public Start(
        @SuppressWarnings("hiding") PBibtex _pBibtex_,
        @SuppressWarnings("hiding") EOF _eof_)
    {
        setPBibtex(_pBibtex_);
        setEOF(_eof_);
    }

    @Override
    public Object clone()
    {
        return new Start(
            cloneNode(this._pBibtex_),
            cloneNode(this._eof_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseStart(this);
    }

    public PBibtex getPBibtex()
    {
        return this._pBibtex_;
    }

    public void setPBibtex(PBibtex node)
    {
        if(this._pBibtex_ != null)
        {
            this._pBibtex_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pBibtex_ = node;
    }

    public EOF getEOF()
    {
        return this._eof_;
    }

    public void setEOF(EOF node)
    {
        if(this._eof_ != null)
        {
            this._eof_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eof_ = node;
    }

    @Override
    void removeChild(Node child)
    {
        if(this._pBibtex_ == child)
        {
            this._pBibtex_ = null;
            return;
        }

        if(this._eof_ == child)
        {
            this._eof_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(Node oldChild, Node newChild)
    {
        if(this._pBibtex_ == oldChild)
        {
            setPBibtex((PBibtex) newChild);
            return;
        }

        if(this._eof_ == oldChild)
        {
            setEOF((EOF) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    public String toString()
    {
        return "" +
            toString(this._pBibtex_) +
            toString(this._eof_);
    }
}
