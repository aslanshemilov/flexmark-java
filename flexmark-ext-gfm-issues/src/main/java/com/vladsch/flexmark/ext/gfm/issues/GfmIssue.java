package com.vladsch.flexmark.ext.gfm.issues;

import com.vladsch.flexmark.ast.CustomNode;
import com.vladsch.flexmark.ast.DoNotDecorate;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/**
 * A GfmIssue node
 */
public class GfmIssue extends CustomNode implements DoNotDecorate {
    protected BasedSequence openingMarker = BasedSequence.NULL;
    protected BasedSequence text = BasedSequence.NULL;

    @Override
    public BasedSequence[] getSegments() {
        //return EMPTY_SEGMENTS;
        return new BasedSequence[] { openingMarker, text };
    }

    @Override
    public void getAstExtra(StringBuilder out) {
        delimitedSegmentSpanChars(out, openingMarker, text, BasedSequence.NULL, "text");
    }

    public GfmIssue() {
    }

    public GfmIssue(BasedSequence chars) {
        super(chars);
    }

    public GfmIssue(BasedSequence openingMarker, BasedSequence text) {
        super(spanningChars(openingMarker, text));
        this.openingMarker = openingMarker;
        this.text = text;
    }

    public BasedSequence getOpeningMarker() {
        return openingMarker;
    }

    public void setOpeningMarker(BasedSequence openingMarker) {
        this.openingMarker = openingMarker;
    }

    public BasedSequence getText() {
        return text;
    }

    public void setText(BasedSequence text) {
        this.text = text;
    }
}