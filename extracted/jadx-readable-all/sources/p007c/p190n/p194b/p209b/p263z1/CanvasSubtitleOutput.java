package p007c.p190n.p194b.p209b.p263z1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.google.android.exoplayer2.p475ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p252x1.CaptionStyleCompat;
import p007c.p190n.p194b.p209b.p252x1.Cue;

/* JADX INFO: renamed from: c.n.b.b.z1.c, reason: use source file name */
/* JADX INFO: compiled from: CanvasSubtitleOutput.java */
/* JADX INFO: loaded from: classes.dex */
public final class CanvasSubtitleOutput extends View implements SubtitleView.InterfaceC5885a {

    /* JADX INFO: renamed from: f */
    public final List<SubtitlePainter> f10375f;

    /* JADX INFO: renamed from: g */
    public List<Cue> f10376g;

    /* JADX INFO: renamed from: h */
    public int f10377h;

    /* JADX INFO: renamed from: i */
    public float f10378i;

    /* JADX INFO: renamed from: j */
    public CaptionStyleCompat f10379j;

    /* JADX INFO: renamed from: k */
    public float f10380k;

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }

    @Override // com.google.android.exoplayer2.p475ui.SubtitleView.InterfaceC5885a
    /* JADX INFO: renamed from: a */
    public void mo4551a(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.f10376g = list;
        this.f10379j = captionStyleCompat;
        this.f10378i = f;
        this.f10377h = i;
        this.f10380k = f2;
        while (this.f10375f.size() < list.size()) {
            this.f10375f.add(new SubtitlePainter(getContext()));
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:192:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:193:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:195:0x04ac  */
    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        boolean z;
        int i3;
        float f;
        int i4;
        float f2;
        boolean z2;
        int i5;
        int iMax;
        int iMin;
        int iRound;
        int i6;
        CanvasSubtitleOutput canvasSubtitleOutput = this;
        Canvas canvas2 = canvas;
        List<Cue> list = canvasSubtitleOutput.f10376g;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i7 = paddingBottom - paddingTop;
        float fM4585u = C2096e.m4585u(canvasSubtitleOutput.f10377h, canvasSubtitleOutput.f10378i, height, i7);
        if (fM4585u <= 0.0f) {
            return;
        }
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            Cue cueM4392a = list.get(i8);
            if (cueM4392a.f9801p != Integer.MIN_VALUE) {
                Cue.b bVarM4391a = cueM4392a.m4391a();
                bVarM4391a.f9809g = -3.4028235E38f;
                bVarM4391a.f9810h = Integer.MIN_VALUE;
                bVarM4391a.f9805c = null;
                if (cueM4392a.f9791f == 0) {
                    bVarM4391a.f9806d = 1.0f - cueM4392a.f9790e;
                    bVarM4391a.f9807e = 0;
                } else {
                    bVarM4391a.f9806d = (-cueM4392a.f9790e) - 1.0f;
                    bVarM4391a.f9807e = 1;
                }
                int i9 = cueM4392a.f9792g;
                if (i9 == 0) {
                    bVarM4391a.f9808f = 2;
                } else if (i9 == 2) {
                    bVarM4391a.f9808f = 0;
                }
                cueM4392a = bVarM4391a.m4392a();
            }
            float fM4585u2 = C2096e.m4585u(cueM4392a.f9799n, cueM4392a.f9800o, height, i7);
            SubtitlePainter subtitlePainter = canvasSubtitleOutput.f10375f.get(i8);
            CaptionStyleCompat captionStyleCompat = canvasSubtitleOutput.f10379j;
            List<Cue> list2 = list;
            float f3 = canvasSubtitleOutput.f10380k;
            Objects.requireNonNull(subtitlePainter);
            boolean z3 = cueM4392a.f9789d == null;
            int i10 = height;
            if (z3) {
                if (TextUtils.isEmpty(cueM4392a.f9787b)) {
                    i7 = i7;
                    i2 = size;
                } else {
                    i = cueM4392a.f9797l ? cueM4392a.f9798m : captionStyleCompat.f9782d;
                }
                i3 = i8;
                i8 = i3 + 1;
                canvas2 = canvas2;
                list = list2;
                i7 = i7;
                height = i10;
                size = i2;
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
                width = width;
                paddingBottom = paddingBottom;
                fM4585u = fM4585u;
                canvasSubtitleOutput = this;
            } else {
                i = -16777216;
            }
            CharSequence charSequence = subtitlePainter.f10415i;
            i2 = size;
            CharSequence charSequence2 = cueM4392a.f9787b;
            if ((charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2))) && Util6.m3113a(subtitlePainter.f10416j, cueM4392a.f9788c) && subtitlePainter.f10417k == cueM4392a.f9789d && subtitlePainter.f10418l == cueM4392a.f9790e && subtitlePainter.f10419m == cueM4392a.f9791f && Util6.m3113a(Integer.valueOf(subtitlePainter.f10420n), Integer.valueOf(cueM4392a.f9792g)) && subtitlePainter.f10421o == cueM4392a.f9793h && Util6.m3113a(Integer.valueOf(subtitlePainter.f10422p), Integer.valueOf(cueM4392a.f9794i)) && subtitlePainter.f10423q == cueM4392a.f9795j && subtitlePainter.f10424r == cueM4392a.f9796k && subtitlePainter.f10425s == captionStyleCompat.f9780b && subtitlePainter.f10426t == captionStyleCompat.f9781c && subtitlePainter.f10427u == i && subtitlePainter.f10429w == captionStyleCompat.f9783e && subtitlePainter.f10428v == captionStyleCompat.f9784f && Util6.m3113a(subtitlePainter.f10412f.getTypeface(), captionStyleCompat.f9785g) && subtitlePainter.f10430x == fM4585u && subtitlePainter.f10431y == fM4585u2 && subtitlePainter.f10432z == f3 && subtitlePainter.f10397A == paddingLeft && subtitlePainter.f10398B == paddingTop && subtitlePainter.f10399C == width && subtitlePainter.f10400D == paddingBottom) {
                subtitlePainter.m4592a(canvas2, z3);
                i3 = i8;
            } else {
                subtitlePainter.f10415i = cueM4392a.f9787b;
                subtitlePainter.f10416j = cueM4392a.f9788c;
                subtitlePainter.f10417k = cueM4392a.f9789d;
                subtitlePainter.f10418l = cueM4392a.f9790e;
                subtitlePainter.f10419m = cueM4392a.f9791f;
                subtitlePainter.f10420n = cueM4392a.f9792g;
                subtitlePainter.f10421o = cueM4392a.f9793h;
                subtitlePainter.f10422p = cueM4392a.f9794i;
                subtitlePainter.f10423q = cueM4392a.f9795j;
                subtitlePainter.f10424r = cueM4392a.f9796k;
                subtitlePainter.f10425s = captionStyleCompat.f9780b;
                subtitlePainter.f10426t = captionStyleCompat.f9781c;
                subtitlePainter.f10427u = i;
                subtitlePainter.f10429w = captionStyleCompat.f9783e;
                subtitlePainter.f10428v = captionStyleCompat.f9784f;
                subtitlePainter.f10412f.setTypeface(captionStyleCompat.f9785g);
                subtitlePainter.f10430x = fM4585u;
                subtitlePainter.f10431y = fM4585u2;
                subtitlePainter.f10432z = f3;
                subtitlePainter.f10397A = paddingLeft;
                subtitlePainter.f10398B = paddingTop;
                subtitlePainter.f10399C = width;
                subtitlePainter.f10400D = paddingBottom;
                if (z3) {
                    Objects.requireNonNull(subtitlePainter.f10415i);
                    CharSequence charSequence3 = subtitlePainter.f10415i;
                    SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(subtitlePainter.f10415i);
                    int i11 = subtitlePainter.f10399C - subtitlePainter.f10397A;
                    int i12 = subtitlePainter.f10400D - subtitlePainter.f10398B;
                    subtitlePainter.f10412f.setTextSize(subtitlePainter.f10430x);
                    int i13 = (int) ((subtitlePainter.f10430x * 0.125f) + 0.5f);
                    int i14 = i13 * 2;
                    int i15 = i11 - i14;
                    float f4 = subtitlePainter.f10423q;
                    if (f4 != -3.4028235E38f) {
                        i15 = (int) (i15 * f4);
                    }
                    if (i15 <= 0) {
                        Log.w("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                        paddingLeft = paddingLeft;
                        paddingTop = paddingTop;
                        width = width;
                        paddingBottom = paddingBottom;
                        fM4585u = fM4585u;
                        i3 = i8;
                        Canvas canvas3 = canvas2;
                        z2 = z3;
                        canvas2 = canvas3;
                    } else {
                        paddingLeft = paddingLeft;
                        paddingTop = paddingTop;
                        if (subtitlePainter.f10431y > 0.0f) {
                            i5 = 0;
                            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) subtitlePainter.f10431y), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            i5 = 0;
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                        if (subtitlePainter.f10429w == 1) {
                            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i5, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                            int i16 = 0;
                            for (int length = foregroundColorSpanArr.length; i16 < length; length = length) {
                                spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i16]);
                                i16++;
                            }
                        }
                        if (Color.alpha(subtitlePainter.f10426t) > 0) {
                            int i17 = subtitlePainter.f10429w;
                            if (i17 == 0 || i17 == 2) {
                                spannableStringBuilder.setSpan(new BackgroundColorSpan(subtitlePainter.f10426t), 0, spannableStringBuilder.length(), 16711680);
                            } else {
                                spannableStringBuilder2.setSpan(new BackgroundColorSpan(subtitlePainter.f10426t), 0, spannableStringBuilder2.length(), 16711680);
                            }
                        }
                        Layout.Alignment alignment = subtitlePainter.f10416j;
                        if (alignment == null) {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        i3 = i8;
                        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, subtitlePainter.f10412f, i15, alignment, subtitlePainter.f10410d, subtitlePainter.f10411e, true);
                        subtitlePainter.f10401E = staticLayout;
                        int height2 = staticLayout.getHeight();
                        int lineCount = subtitlePainter.f10401E.getLineCount();
                        int i18 = 0;
                        int iMax2 = 0;
                        while (i18 < lineCount) {
                            iMax2 = Math.max((int) Math.ceil(subtitlePainter.f10401E.getLineWidth(i18)), iMax2);
                            i18++;
                            lineCount = lineCount;
                            z3 = z3;
                        }
                        z = z3;
                        if (subtitlePainter.f10423q == -3.4028235E38f || iMax2 >= i15) {
                            i15 = iMax2;
                        }
                        int i19 = i15 + i14;
                        float f5 = subtitlePainter.f10421o;
                        if (f5 != -3.4028235E38f) {
                            int iRound2 = Math.round(i11 * f5);
                            int i20 = subtitlePainter.f10397A;
                            int i21 = iRound2 + i20;
                            int i22 = subtitlePainter.f10422p;
                            if (i22 == 1) {
                                i21 = ((i21 * 2) - i19) / 2;
                            } else if (i22 == 2) {
                                i21 -= i19;
                            }
                            iMax = Math.max(i21, i20);
                            iMin = Math.min(i19 + iMax, subtitlePainter.f10399C);
                        } else {
                            iMax = subtitlePainter.f10397A + ((i11 - i19) / 2);
                            iMin = iMax + i19;
                        }
                        int i23 = iMin - iMax;
                        if (i23 <= 0) {
                            Log.w("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                            canvas2 = canvas;
                            z2 = z;
                        } else {
                            float f6 = subtitlePainter.f10418l;
                            if (f6 != -3.4028235E38f) {
                                if (subtitlePainter.f10419m == 0) {
                                    iRound = Math.round(i12 * f6) + subtitlePainter.f10398B;
                                    int i24 = subtitlePainter.f10420n;
                                    if (i24 == 2) {
                                        iRound -= height2;
                                    } else if (i24 == 1) {
                                        iRound = ((iRound * 2) - height2) / 2;
                                    }
                                } else {
                                    int lineBottom = subtitlePainter.f10401E.getLineBottom(0) - subtitlePainter.f10401E.getLineTop(0);
                                    float f7 = subtitlePainter.f10418l;
                                    if (f7 >= 0.0f) {
                                        iRound = Math.round(f7 * lineBottom) + subtitlePainter.f10398B;
                                    } else {
                                        iRound = Math.round((f7 + 1.0f) * lineBottom) + subtitlePainter.f10400D;
                                        iRound -= height2;
                                    }
                                }
                                int i25 = iRound + height2;
                                int i26 = subtitlePainter.f10400D;
                                if (i25 > i26) {
                                    iRound = i26 - height2;
                                } else {
                                    i6 = subtitlePainter.f10398B;
                                    if (iRound >= i6) {
                                    }
                                    Layout.Alignment alignment2 = alignment;
                                    subtitlePainter.f10401E = new StaticLayout(spannableStringBuilder, subtitlePainter.f10412f, i23, alignment2, subtitlePainter.f10410d, subtitlePainter.f10411e, true);
                                    subtitlePainter.f10402F = new StaticLayout(spannableStringBuilder2, subtitlePainter.f10412f, i23, alignment2, subtitlePainter.f10410d, subtitlePainter.f10411e, true);
                                    subtitlePainter.f10403G = iMax;
                                    subtitlePainter.f10404H = i6;
                                    subtitlePainter.f10405I = i13;
                                }
                            } else {
                                iRound = (subtitlePainter.f10400D - height2) - ((int) (i12 * subtitlePainter.f10432z));
                            }
                            i6 = iRound;
                            Layout.Alignment alignment3 = alignment;
                            subtitlePainter.f10401E = new StaticLayout(spannableStringBuilder, subtitlePainter.f10412f, i23, alignment3, subtitlePainter.f10410d, subtitlePainter.f10411e, true);
                            subtitlePainter.f10402F = new StaticLayout(spannableStringBuilder2, subtitlePainter.f10412f, i23, alignment3, subtitlePainter.f10410d, subtitlePainter.f10411e, true);
                            subtitlePainter.f10403G = iMax;
                            subtitlePainter.f10404H = i6;
                            subtitlePainter.f10405I = i13;
                        }
                    }
                    subtitlePainter.m4592a(canvas2, z2);
                } else {
                    z = z3;
                    paddingLeft = paddingLeft;
                    paddingTop = paddingTop;
                    width = width;
                    paddingBottom = paddingBottom;
                    fM4585u = fM4585u;
                    i3 = i8;
                    Objects.requireNonNull(subtitlePainter.f10417k);
                    Bitmap bitmap = subtitlePainter.f10417k;
                    int i27 = subtitlePainter.f10399C;
                    int i28 = subtitlePainter.f10397A;
                    int i29 = subtitlePainter.f10400D;
                    int i30 = subtitlePainter.f10398B;
                    float f8 = i27 - i28;
                    float f9 = (subtitlePainter.f10421o * f8) + i28;
                    float f10 = i29 - i30;
                    float f11 = (subtitlePainter.f10418l * f10) + i30;
                    int iRound3 = Math.round(f8 * subtitlePainter.f10423q);
                    float f12 = subtitlePainter.f10424r;
                    int iRound4 = f12 != -3.4028235E38f ? Math.round(f10 * f12) : Math.round((bitmap.getHeight() / bitmap.getWidth()) * iRound3);
                    int i31 = subtitlePainter.f10422p;
                    if (i31 == 2) {
                        f = iRound3;
                    } else {
                        if (i31 == 1) {
                            f = iRound3 / 2;
                        }
                        int iRound5 = Math.round(f9);
                        i4 = subtitlePainter.f10420n;
                        if (i4 == 2) {
                            f2 = iRound4;
                        } else {
                            if (i4 == 1) {
                                f2 = iRound4 / 2;
                            }
                            int iRound6 = Math.round(f11);
                            subtitlePainter.f10406J = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                        }
                        f11 -= f2;
                        int iRound7 = Math.round(f11);
                        subtitlePainter.f10406J = new Rect(iRound5, iRound7, iRound3 + iRound5, iRound4 + iRound7);
                    }
                    f9 -= f;
                    int iRound8 = Math.round(f9);
                    i4 = subtitlePainter.f10420n;
                    if (i4 == 2) {
                        f2 = iRound4;
                    } else {
                        if (i4 == 1) {
                            f2 = iRound4 / 2;
                        }
                        int iRound9 = Math.round(f11);
                        subtitlePainter.f10406J = new Rect(iRound8, iRound9, iRound3 + iRound8, iRound4 + iRound9);
                    }
                    f11 -= f2;
                    int iRound10 = Math.round(f11);
                    subtitlePainter.f10406J = new Rect(iRound8, iRound10, iRound3 + iRound8, iRound4 + iRound10);
                }
                canvas2 = canvas;
                z2 = z;
                subtitlePainter.m4592a(canvas2, z2);
            }
            i8 = i3 + 1;
            canvas2 = canvas2;
            list = list2;
            i7 = i7;
            height = i10;
            size = i2;
            paddingLeft = paddingLeft;
            paddingTop = paddingTop;
            width = width;
            paddingBottom = paddingBottom;
            fM4585u = fM4585u;
            canvasSubtitleOutput = this;
        }
    }

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10375f = new ArrayList();
        this.f10376g = Collections.emptyList();
        this.f10377h = 0;
        this.f10378i = 0.0533f;
        this.f10379j = CaptionStyleCompat.f9779a;
        this.f10380k = 0.08f;
    }
}
