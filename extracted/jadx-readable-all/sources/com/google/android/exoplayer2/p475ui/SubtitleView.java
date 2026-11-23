package com.google.android.exoplayer2.p475ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p252x1.CaptionStyleCompat;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.TextOutput;
import p007c.p190n.p194b.p209b.p263z1.CanvasSubtitleOutput;
import p007c.p190n.p194b.p209b.p263z1.WebViewSubtitleOutput;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements TextOutput {

    /* JADX INFO: renamed from: f */
    public List<Cue> f28429f;

    /* JADX INFO: renamed from: g */
    public CaptionStyleCompat f28430g;

    /* JADX INFO: renamed from: h */
    public int f28431h;

    /* JADX INFO: renamed from: i */
    public float f28432i;

    /* JADX INFO: renamed from: j */
    public float f28433j;

    /* JADX INFO: renamed from: k */
    public boolean f28434k;

    /* JADX INFO: renamed from: l */
    public boolean f28435l;

    /* JADX INFO: renamed from: m */
    public int f28436m;

    /* JADX INFO: renamed from: n */
    public InterfaceC5885a f28437n;

    /* JADX INFO: renamed from: o */
    public View f28438o;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.SubtitleView$a */
    public interface InterfaceC5885a {
        /* JADX INFO: renamed from: a */
        void mo4551a(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private List<Cue> getCuesWithStylingPreferencesApplied() {
        if (this.f28434k && this.f28435l) {
            return this.f28429f;
        }
        ArrayList arrayList = new ArrayList(this.f28429f.size());
        for (int i = 0; i < this.f28429f.size(); i++) {
            Cue cueM4392a = this.f28429f.get(i);
            CharSequence charSequence = cueM4392a.f9787b;
            if (!this.f28434k) {
                Cue.b bVarM4391a = cueM4392a.m4391a();
                bVarM4391a.f9812j = -3.4028235E38f;
                bVarM4391a.f9811i = Integer.MIN_VALUE;
                bVarM4391a.f9815m = false;
                if (charSequence != null) {
                    bVarM4391a.f9803a = charSequence.toString();
                }
                cueM4392a = bVarM4391a.m4392a();
            } else if (!this.f28435l && charSequence != null) {
                Cue.b bVarM4391a2 = cueM4392a.m4391a();
                bVarM4391a2.f9812j = -3.4028235E38f;
                bVarM4391a2.f9811i = Integer.MIN_VALUE;
                if (charSequence instanceof Spanned) {
                    SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                    for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) spannableStringValueOf.getSpans(0, spannableStringValueOf.length(), AbsoluteSizeSpan.class)) {
                        spannableStringValueOf.removeSpan(absoluteSizeSpan);
                    }
                    for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannableStringValueOf.getSpans(0, spannableStringValueOf.length(), RelativeSizeSpan.class)) {
                        spannableStringValueOf.removeSpan(relativeSizeSpan);
                    }
                    bVarM4391a2.f9803a = spannableStringValueOf;
                }
                cueM4392a = bVarM4391a2.m4392a();
            }
            arrayList.add(cueM4392a);
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (Util6.f6307a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private CaptionStyleCompat getUserCaptionStyle() {
        int i = Util6.f6307a;
        if (i < 19 || isInEditMode()) {
            return CaptionStyleCompat.f9779a;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            return CaptionStyleCompat.f9779a;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        CaptionStyleCompat captionStyleCompat = CaptionStyleCompat.f9779a;
        if (i >= 21) {
            return new CaptionStyleCompat(userStyle.hasForegroundColor() ? userStyle.foregroundColor : CaptionStyleCompat.f9779a.f9780b, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : CaptionStyleCompat.f9779a.f9781c, userStyle.hasWindowColor() ? userStyle.windowColor : CaptionStyleCompat.f9779a.f9782d, userStyle.hasEdgeType() ? userStyle.edgeType : CaptionStyleCompat.f9779a.f9783e, userStyle.hasEdgeColor() ? userStyle.edgeColor : CaptionStyleCompat.f9779a.f9784f, userStyle.getTypeface());
        }
        return new CaptionStyleCompat(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
    }

    private <T extends View & InterfaceC5885a> void setView(T t) {
        removeView(this.f28438o);
        View view = this.f28438o;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).f10434g.destroy();
        }
        this.f28438o = t;
        this.f28437n = t;
        addView(t);
    }

    /* JADX INFO: renamed from: a */
    public final void m12632a() {
        this.f28437n.mo4551a(getCuesWithStylingPreferencesApplied(), this.f28430g, this.f28432i, this.f28431h, this.f28433j);
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.TextOutput
    /* JADX INFO: renamed from: c */
    public void mo1147c(List<Cue> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f28435l = z;
        m12632a();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f28434k = z;
        m12632a();
    }

    public void setBottomPaddingFraction(float f) {
        this.f28433j = f;
        m12632a();
    }

    public void setCues(List<Cue> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f28429f = list;
        m12632a();
    }

    public void setFractionalTextSize(float f) {
        this.f28431h = 0;
        this.f28432i = f;
        m12632a();
    }

    public void setStyle(CaptionStyleCompat captionStyleCompat) {
        this.f28430g = captionStyleCompat;
        m12632a();
    }

    public void setViewType(int i) {
        if (this.f28436m == i) {
            return;
        }
        if (i == 1) {
            setView(new CanvasSubtitleOutput(getContext()));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new WebViewSubtitleOutput(getContext()));
        }
        this.f28436m = i;
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28429f = Collections.emptyList();
        this.f28430g = CaptionStyleCompat.f9779a;
        this.f28431h = 0;
        this.f28432i = 0.0533f;
        this.f28433j = 0.08f;
        this.f28434k = true;
        this.f28435l = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.f28437n = canvasSubtitleOutput;
        this.f28438o = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f28436m = 1;
    }
}
