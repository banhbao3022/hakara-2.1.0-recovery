package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p337c.AnimationUtils;
import p007c.p190n.p194b.p334e.p338c0.ClearTextEndIconDelegate;
import p007c.p190n.p194b.p334e.p338c0.CustomEndIconDelegate;
import p007c.p190n.p194b.p334e.p338c0.CutoutDrawable;
import p007c.p190n.p194b.p334e.p338c0.DropdownMenuEndIconDelegate;
import p007c.p190n.p194b.p334e.p338c0.EndIconDelegate;
import p007c.p190n.p194b.p334e.p338c0.IndicatorViewController;
import p007c.p190n.p194b.p334e.p338c0.NoEndIconDelegate;
import p007c.p190n.p194b.p334e.p338c0.PasswordToggleEndIconDelegate;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p360t.CollapsingTextHelper;
import p007c.p190n.p194b.p334e.p360t.DescendantOffsetUtils;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p644b.p653h.AppCompatDrawableManager;
import p636z0.p644b.p653h.AppCompatTextView;
import p636z0.p644b.p653h.DrawableUtils;
import p636z0.p644b.p653h.TintTypedArray;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p725k.p729e.ColorUtils;
import p636z0.p725k.p737j.BidiFormatter;
import p636z0.p725k.p739l.AccessibilityDelegateCompat;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;
import p636z0.p745m.p746a.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: A */
    public final TextView f29105A;

    /* JADX INFO: renamed from: A0 */
    public int f29106A0;

    /* JADX INFO: renamed from: B */
    public CharSequence f29107B;

    /* JADX INFO: renamed from: B0 */
    public ColorStateList f29108B0;

    /* JADX INFO: renamed from: C */
    public final TextView f29109C;

    /* JADX INFO: renamed from: C0 */
    public int f29110C0;

    /* JADX INFO: renamed from: D */
    public boolean f29111D;

    /* JADX INFO: renamed from: D0 */
    public int f29112D0;

    /* JADX INFO: renamed from: E */
    public CharSequence f29113E;

    /* JADX INFO: renamed from: E0 */
    public int f29114E0;

    /* JADX INFO: renamed from: F */
    public boolean f29115F;

    /* JADX INFO: renamed from: F0 */
    public int f29116F0;

    /* JADX INFO: renamed from: G */
    public MaterialShapeDrawable f29117G;

    /* JADX INFO: renamed from: G0 */
    public int f29118G0;

    /* JADX INFO: renamed from: H */
    public MaterialShapeDrawable f29119H;

    /* JADX INFO: renamed from: H0 */
    public boolean f29120H0;

    /* JADX INFO: renamed from: I */
    public ShapeAppearanceModel f29121I;

    /* JADX INFO: renamed from: I0 */
    public final CollapsingTextHelper f29122I0;

    /* JADX INFO: renamed from: J */
    public final int f29123J;

    /* JADX INFO: renamed from: J0 */
    public boolean f29124J0;

    /* JADX INFO: renamed from: K */
    public int f29125K;

    /* JADX INFO: renamed from: K0 */
    public boolean f29126K0;

    /* JADX INFO: renamed from: L */
    public int f29127L;

    /* JADX INFO: renamed from: L0 */
    public ValueAnimator f29128L0;

    /* JADX INFO: renamed from: M */
    public int f29129M;

    /* JADX INFO: renamed from: M0 */
    public boolean f29130M0;

    /* JADX INFO: renamed from: N */
    public int f29131N;

    /* JADX INFO: renamed from: N0 */
    public boolean f29132N0;

    /* JADX INFO: renamed from: O */
    public int f29133O;

    /* JADX INFO: renamed from: P */
    public int f29134P;

    /* JADX INFO: renamed from: Q */
    public int f29135Q;

    /* JADX INFO: renamed from: R */
    public final Rect f29136R;

    /* JADX INFO: renamed from: S */
    public final Rect f29137S;

    /* JADX INFO: renamed from: T */
    public final RectF f29138T;

    /* JADX INFO: renamed from: U */
    public Typeface f29139U;

    /* JADX INFO: renamed from: V */
    public final CheckableImageButton f29140V;

    /* JADX INFO: renamed from: W */
    public ColorStateList f29141W;

    /* JADX INFO: renamed from: a0 */
    public boolean f29142a0;

    /* JADX INFO: renamed from: b0 */
    public PorterDuff.Mode f29143b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f29144c0;

    /* JADX INFO: renamed from: d0 */
    public Drawable f29145d0;

    /* JADX INFO: renamed from: e0 */
    public int f29146e0;

    /* JADX INFO: renamed from: f */
    public final FrameLayout f29147f;

    /* JADX INFO: renamed from: f0 */
    public View.OnLongClickListener f29148f0;

    /* JADX INFO: renamed from: g */
    public final LinearLayout f29149g;

    /* JADX INFO: renamed from: g0 */
    public final LinkedHashSet<InterfaceC5978f> f29150g0;

    /* JADX INFO: renamed from: h */
    public final LinearLayout f29151h;

    /* JADX INFO: renamed from: h0 */
    public int f29152h0;

    /* JADX INFO: renamed from: i */
    public final FrameLayout f29153i;

    /* JADX INFO: renamed from: i0 */
    public final SparseArray<EndIconDelegate> f29154i0;

    /* JADX INFO: renamed from: j */
    public EditText f29155j;

    /* JADX INFO: renamed from: j0 */
    public final CheckableImageButton f29156j0;

    /* JADX INFO: renamed from: k */
    public CharSequence f29157k;

    /* JADX INFO: renamed from: k0 */
    public final LinkedHashSet<InterfaceC5979g> f29158k0;

    /* JADX INFO: renamed from: l */
    public final IndicatorViewController f29159l;

    /* JADX INFO: renamed from: l0 */
    public ColorStateList f29160l0;

    /* JADX INFO: renamed from: m */
    public boolean f29161m;

    /* JADX INFO: renamed from: m0 */
    public boolean f29162m0;

    /* JADX INFO: renamed from: n */
    public int f29163n;

    /* JADX INFO: renamed from: n0 */
    public PorterDuff.Mode f29164n0;

    /* JADX INFO: renamed from: o */
    public boolean f29165o;

    /* JADX INFO: renamed from: o0 */
    public boolean f29166o0;

    /* JADX INFO: renamed from: p */
    public TextView f29167p;

    /* JADX INFO: renamed from: p0 */
    public Drawable f29168p0;

    /* JADX INFO: renamed from: q */
    public int f29169q;

    /* JADX INFO: renamed from: q0 */
    public int f29170q0;

    /* JADX INFO: renamed from: r */
    public int f29171r;

    /* JADX INFO: renamed from: r0 */
    public Drawable f29172r0;

    /* JADX INFO: renamed from: s */
    public CharSequence f29173s;

    /* JADX INFO: renamed from: s0 */
    public View.OnLongClickListener f29174s0;

    /* JADX INFO: renamed from: t */
    public boolean f29175t;

    /* JADX INFO: renamed from: t0 */
    public View.OnLongClickListener f29176t0;

    /* JADX INFO: renamed from: u */
    public TextView f29177u;

    /* JADX INFO: renamed from: u0 */
    public final CheckableImageButton f29178u0;

    /* JADX INFO: renamed from: v */
    public ColorStateList f29179v;

    /* JADX INFO: renamed from: v0 */
    public ColorStateList f29180v0;

    /* JADX INFO: renamed from: w */
    public int f29181w;

    /* JADX INFO: renamed from: w0 */
    public ColorStateList f29182w0;

    /* JADX INFO: renamed from: x */
    public ColorStateList f29183x;

    /* JADX INFO: renamed from: x0 */
    public ColorStateList f29184x0;

    /* JADX INFO: renamed from: y */
    public ColorStateList f29185y;

    /* JADX INFO: renamed from: y0 */
    public int f29186y0;

    /* JADX INFO: renamed from: z */
    public CharSequence f29187z;

    /* JADX INFO: renamed from: z0 */
    public int f29188z0;

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C5973a implements TextWatcher {
        public C5973a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m12878y(!textInputLayout.f29132N0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f29161m) {
                textInputLayout2.m12873t(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.f29175t) {
                textInputLayout3.m12879z(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class RunnableC5974b implements Runnable {
        public RunnableC5974b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f29156j0.performClick();
            TextInputLayout.this.f29156j0.jumpDrawablesToCurrentState();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class RunnableC5975c implements Runnable {
        public RunnableC5975c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f29155j.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public class C5976d implements ValueAnimator.AnimatorUpdateListener {
        public C5976d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f29122I0.m11325w(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C5977e extends AccessibilityDelegateCompat {

        /* JADX INFO: renamed from: d */
        public final TextInputLayout f29193d;

        public C5977e(TextInputLayout textInputLayout) {
            this.f29193d = textInputLayout;
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: d */
        public void mo382d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f37977b.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f38018b);
            EditText editText = this.f29193d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f29193d.getHint();
            CharSequence error = this.f29193d.getError();
            CharSequence placeholderText = this.f29193d.getPlaceholderText();
            int counterMaxLength = this.f29193d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f29193d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f29193d.f29120H0;
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = z2 ? hint.toString() : "";
            if (z) {
                accessibilityNodeInfoCompat.f38018b.setText(text);
            } else if (!TextUtils.isEmpty(string)) {
                accessibilityNodeInfoCompat.f38018b.setText(string);
                if (z3 && placeholderText != null) {
                    accessibilityNodeInfoCompat.f38018b.setText(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.f38018b.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    accessibilityNodeInfoCompat.m16274r(string);
                } else {
                    if (z) {
                        string = ((Object) text) + ", " + string;
                    }
                    accessibilityNodeInfoCompat.f38018b.setText(string);
                }
                boolean z6 = !z;
                if (i >= 26) {
                    accessibilityNodeInfoCompat.f38018b.setShowingHintText(z6);
                } else {
                    accessibilityNodeInfoCompat.m16271o(4, z6);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfoCompat.f38018b.setMaxTextLength(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.f38018b.setError(error);
            }
            if (editText != null) {
                editText.setLabelFor(R.id.textinput_helper_text);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface InterfaceC5978f {
        /* JADX INFO: renamed from: a */
        void mo11046a(TextInputLayout textInputLayout);
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface InterfaceC5979g {
        /* JADX INFO: renamed from: a */
        void mo11047a(TextInputLayout textInputLayout, int i);
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$h */
    public static class C5980h extends AbsSavedState {
        public static final Parcelable.Creator<C5980h> CREATOR = new a();

        /* JADX INFO: renamed from: h */
        public CharSequence f29194h;

        /* JADX INFO: renamed from: i */
        public boolean f29195i;

        /* JADX INFO: renamed from: j */
        public CharSequence f29196j;

        /* JADX INFO: renamed from: k */
        public CharSequence f29197k;

        /* JADX INFO: renamed from: l */
        public CharSequence f29198l;

        /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        public static class a implements Parcelable.ClassLoaderCreator<C5980h> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C5980h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C5980h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C5980h[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C5980h(parcel, null);
            }
        }

        public C5980h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("TextInputLayout.SavedState{");
            sbM1556G.append(Integer.toHexString(System.identityHashCode(this)));
            sbM1556G.append(" error=");
            sbM1556G.append((Object) this.f29194h);
            sbM1556G.append(" hint=");
            sbM1556G.append((Object) this.f29196j);
            sbM1556G.append(" helperText=");
            sbM1556G.append((Object) this.f29197k);
            sbM1556G.append(" placeholderText=");
            sbM1556G.append((Object) this.f29198l);
            sbM1556G.append("}");
            return sbM1556G.toString();
        }

        @Override // p636z0.p745m.p746a.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f38150g, i);
            TextUtils.writeToParcel(this.f29194h, parcel, i);
            parcel.writeInt(this.f29195i ? 1 : 0);
            TextUtils.writeToParcel(this.f29196j, parcel, i);
            TextUtils.writeToParcel(this.f29197k, parcel, i);
            TextUtils.writeToParcel(this.f29198l, parcel, i);
        }

        public C5980h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f29194h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f29195i = parcel.readInt() == 1;
            this.f29196j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f29197k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f29198l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private EndIconDelegate getEndIconDelegate() {
        EndIconDelegate endIconDelegate = this.f29154i0.get(this.f29152h0);
        return endIconDelegate != null ? endIconDelegate : this.f29154i0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f29178u0.getVisibility() == 0) {
            return this.f29178u0;
        }
        if (m12865j() && m12866k()) {
            return this.f29156j0;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static void m12848n(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m12848n((ViewGroup) childAt, z);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m12849q(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    private void setEditText(EditText editText) {
        if (this.f29155j != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f29152h0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f29155j = editText;
        m12867l();
        setTextInputAccessibilityDelegate(new C5977e(this));
        this.f29122I0.m11305A(this.f29155j.getTypeface());
        CollapsingTextHelper collapsingTextHelper = this.f29122I0;
        float textSize = this.f29155j.getTextSize();
        if (collapsingTextHelper.f25447i != textSize) {
            collapsingTextHelper.f25447i = textSize;
            collapsingTextHelper.m11316m();
        }
        int gravity = this.f29155j.getGravity();
        this.f29122I0.m11319q((gravity & (-113)) | 48);
        this.f29122I0.m11323u(gravity);
        this.f29155j.addTextChangedListener(new C5973a());
        if (this.f29182w0 == null) {
            this.f29182w0 = this.f29155j.getHintTextColors();
        }
        if (this.f29111D) {
            if (TextUtils.isEmpty(this.f29113E)) {
                CharSequence hint = this.f29155j.getHint();
                this.f29157k = hint;
                setHint(hint);
                this.f29155j.setHint((CharSequence) null);
            }
            this.f29115F = true;
        }
        if (this.f29167p != null) {
            m12873t(this.f29155j.getText().length());
        }
        m12876w();
        this.f29159l.m11058b();
        this.f29149g.bringToFront();
        this.f29151h.bringToFront();
        this.f29153i.bringToFront();
        this.f29178u0.bringToFront();
        Iterator<InterfaceC5978f> it = this.f29150g0.iterator();
        while (it.hasNext()) {
            it.next().mo11046a(this);
        }
        m12850A();
        m12853D();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m12878y(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.f29178u0.setVisibility(z ? 0 : 8);
        this.f29153i.setVisibility(z ? 8 : 0);
        m12853D();
        if (m12865j()) {
            return;
        }
        m12875v();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f29113E)) {
            return;
        }
        this.f29113E = charSequence;
        this.f29122I0.m11328z(charSequence);
        if (this.f29120H0) {
            return;
        }
        m12868m();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f29175t == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f29177u = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            TextView textView = this.f29177u;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            textView.setAccessibilityLiveRegion(1);
            setPlaceholderTextAppearance(this.f29181w);
            setPlaceholderTextColor(this.f29179v);
            TextView textView2 = this.f29177u;
            if (textView2 != null) {
                this.f29147f.addView(textView2);
                this.f29177u.setVisibility(0);
            }
        } else {
            TextView textView3 = this.f29177u;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            this.f29177u = null;
        }
        this.f29175t = z;
    }

    /* JADX INFO: renamed from: A */
    public final void m12850A() {
        if (this.f29155j == null) {
            return;
        }
        int paddingStart = 0;
        if (!(this.f29140V.getVisibility() == 0)) {
            EditText editText = this.f29155j;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            paddingStart = editText.getPaddingStart();
        }
        TextView textView = this.f29105A;
        int compoundPaddingTop = this.f29155j.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = this.f29155j.getCompoundPaddingBottom();
        AtomicInteger atomicInteger2 = ViewCompat.f38073a;
        textView.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* JADX INFO: renamed from: B */
    public final void m12851B() {
        this.f29105A.setVisibility((this.f29187z == null || this.f29120H0) ? 8 : 0);
        m12875v();
    }

    /* JADX INFO: renamed from: C */
    public final void m12852C(boolean z, boolean z2) {
        int defaultColor = this.f29108B0.getDefaultColor();
        int colorForState = this.f29108B0.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f29108B0.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f29134P = colorForState2;
        } else if (z2) {
            this.f29134P = colorForState;
        } else {
            this.f29134P = defaultColor;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m12853D() {
        if (this.f29155j == null) {
            return;
        }
        int paddingEnd = 0;
        if (!m12866k()) {
            if (!(this.f29178u0.getVisibility() == 0)) {
                EditText editText = this.f29155j;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                paddingEnd = editText.getPaddingEnd();
            }
        }
        TextView textView = this.f29109C;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.f29155j.getPaddingTop();
        int paddingBottom = this.f29155j.getPaddingBottom();
        AtomicInteger atomicInteger2 = ViewCompat.f38073a;
        textView.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    /* JADX INFO: renamed from: E */
    public final void m12854E() {
        int visibility = this.f29109C.getVisibility();
        boolean z = (this.f29107B == null || this.f29120H0) ? false : true;
        this.f29109C.setVisibility(z ? 0 : 8);
        if (visibility != this.f29109C.getVisibility()) {
            getEndIconDelegate().mo11044c(z);
        }
        m12875v();
    }

    /* JADX INFO: renamed from: F */
    public void m12855F() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f29117G == null || this.f29125K == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f29155j) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.f29155j) != null && editText.isHovered());
        if (!isEnabled()) {
            this.f29134P = this.f29118G0;
        } else if (this.f29159l.m11061e()) {
            if (this.f29108B0 != null) {
                m12852C(z2, z3);
            } else {
                this.f29134P = this.f29159l.m11063g();
            }
        } else if (!this.f29165o || (textView = this.f29167p) == null) {
            if (z2) {
                this.f29134P = this.f29106A0;
            } else if (z3) {
                this.f29134P = this.f29188z0;
            } else {
                this.f29134P = this.f29186y0;
            }
        } else if (this.f29108B0 != null) {
            m12852C(z2, z3);
        } else {
            this.f29134P = textView.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null) {
            IndicatorViewController indicatorViewController = this.f29159l;
            if (indicatorViewController.f24877k && indicatorViewController.m11061e()) {
                z = true;
            }
        }
        setErrorIconVisible(z);
        m12870p(this.f29178u0, this.f29180v0);
        m12870p(this.f29140V, this.f29141W);
        m12869o();
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        Objects.requireNonNull(endIconDelegate);
        if (endIconDelegate instanceof DropdownMenuEndIconDelegate) {
            if (!this.f29159l.m11061e() || getEndIconDrawable() == null) {
                m12859d();
            } else {
                Drawable drawableMutate = C8162a.m16054Y(getEndIconDrawable()).mutate();
                drawableMutate.setTint(this.f29159l.m11063g());
                this.f29156j0.setImageDrawable(drawableMutate);
            }
        }
        if (z2 && isEnabled()) {
            this.f29129M = this.f29133O;
        } else {
            this.f29129M = this.f29131N;
        }
        if (this.f29125K == 1) {
            if (!isEnabled()) {
                this.f29135Q = this.f29112D0;
            } else if (z3 && !z2) {
                this.f29135Q = this.f29116F0;
            } else if (z2) {
                this.f29135Q = this.f29114E0;
            } else {
                this.f29135Q = this.f29110C0;
            }
        }
        m12858c();
    }

    /* JADX INFO: renamed from: a */
    public void m12856a(InterfaceC5978f interfaceC5978f) {
        this.f29150g0.add(interfaceC5978f);
        if (this.f29155j != null) {
            interfaceC5978f.mo11046a(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f29147f.addView(view, layoutParams2);
        this.f29147f.setLayoutParams(layoutParams);
        m12877x();
        setEditText((EditText) view);
    }

    /* JADX INFO: renamed from: b */
    public void m12857b(float f) {
        if (this.f29122I0.f25441c == f) {
            return;
        }
        if (this.f29128L0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f29128L0 = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.f24794b);
            this.f29128L0.setDuration(167L);
            this.f29128L0.addUpdateListener(new C5976d());
        }
        this.f29128L0.setFloatValues(this.f29122I0.f25441c, f);
        this.f29128L0.start();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    /* JADX INFO: renamed from: c */
    public final void m12858c() {
        boolean z;
        MaterialShapeDrawable materialShapeDrawable = this.f29117G;
        if (materialShapeDrawable == null) {
            return;
        }
        materialShapeDrawable.setShapeAppearanceModel(this.f29121I);
        boolean z2 = false;
        if (this.f29125K != 2) {
            z = false;
        } else {
            if (this.f29129M > -1 && this.f29134P != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.f29117G.m11386v(this.f29129M, this.f29134P);
        }
        int iM16163b = this.f29135Q;
        if (this.f29125K == 1) {
            iM16163b = ColorUtils.m16163b(this.f29135Q, C4799a.m10959J(getContext(), R.attr.colorSurface, 0));
        }
        this.f29135Q = iM16163b;
        this.f29117G.m11381q(ColorStateList.valueOf(iM16163b));
        if (this.f29152h0 == 3) {
            this.f29155j.getBackground().invalidateSelf();
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.f29119H;
        if (materialShapeDrawable2 != null) {
            if (this.f29129M > -1 && this.f29134P != 0) {
                z2 = true;
            }
            if (z2) {
                materialShapeDrawable2.m11381q(ColorStateList.valueOf(this.f29134P));
            }
            invalidate();
        }
        invalidate();
    }

    /* JADX INFO: renamed from: d */
    public final void m12859d() {
        m12860e(this.f29156j0, this.f29162m0, this.f29160l0, this.f29166o0, this.f29164n0);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f29155j;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f29157k != null) {
            boolean z = this.f29115F;
            this.f29115F = false;
            CharSequence hint = editText.getHint();
            this.f29155j.setHint(this.f29157k);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f29155j.setHint(hint);
                this.f29115F = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.f29147f.getChildCount());
        for (int i2 = 0; i2 < this.f29147f.getChildCount(); i2++) {
            View childAt = this.f29147f.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f29155j) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f29132N0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f29132N0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f29111D) {
            this.f29122I0.m11311g(canvas);
        }
        MaterialShapeDrawable materialShapeDrawable = this.f29119H;
        if (materialShapeDrawable != null) {
            Rect bounds = materialShapeDrawable.getBounds();
            bounds.top = bounds.bottom - this.f29129M;
            this.f29119H.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f29130M0) {
            return;
        }
        this.f29130M0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        CollapsingTextHelper collapsingTextHelper = this.f29122I0;
        boolean zM11327y = collapsingTextHelper != null ? collapsingTextHelper.m11327y(drawableState) | false : false;
        if (this.f29155j != null) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            m12878y(isLaidOut() && isEnabled(), false);
        }
        m12876w();
        m12855F();
        if (zM11327y) {
            invalidate();
        }
        this.f29130M0 = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m12860e(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C8162a.m16054Y(drawable).mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m12861f() {
        float fM11312h;
        if (!this.f29111D) {
            return 0;
        }
        int i = this.f29125K;
        if (i == 0 || i == 1) {
            fM11312h = this.f29122I0.m11312h();
        } else {
            if (i != 2) {
                return 0;
            }
            fM11312h = this.f29122I0.m11312h() / 2.0f;
        }
        return (int) fM11312h;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m12862g() {
        return this.f29111D && !TextUtils.isEmpty(this.f29113E) && (this.f29117G instanceof CutoutDrawable);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f29155j;
        if (editText == null) {
            return super.getBaseline();
        }
        return m12861f() + getPaddingTop() + editText.getBaseline();
    }

    public MaterialShapeDrawable getBoxBackground() {
        int i = this.f29125K;
        if (i == 1 || i == 2) {
            return this.f29117G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f29135Q;
    }

    public int getBoxBackgroundMode() {
        return this.f29125K;
    }

    public float getBoxCornerRadiusBottomEnd() {
        MaterialShapeDrawable materialShapeDrawable = this.f29117G;
        return materialShapeDrawable.f25574h.f25594a.f25626i.mo11363a(materialShapeDrawable.m11372h());
    }

    public float getBoxCornerRadiusBottomStart() {
        MaterialShapeDrawable materialShapeDrawable = this.f29117G;
        return materialShapeDrawable.f25574h.f25594a.f25625h.mo11363a(materialShapeDrawable.m11372h());
    }

    public float getBoxCornerRadiusTopEnd() {
        MaterialShapeDrawable materialShapeDrawable = this.f29117G;
        return materialShapeDrawable.f25574h.f25594a.f25624g.mo11363a(materialShapeDrawable.m11372h());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f29117G.m11376l();
    }

    public int getBoxStrokeColor() {
        return this.f29106A0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f29108B0;
    }

    public int getBoxStrokeWidth() {
        return this.f29131N;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f29133O;
    }

    public int getCounterMaxLength() {
        return this.f29163n;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f29161m && this.f29165o && (textView = this.f29167p) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f29183x;
    }

    public ColorStateList getCounterTextColor() {
        return this.f29183x;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f29182w0;
    }

    public EditText getEditText() {
        return this.f29155j;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f29156j0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f29156j0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f29152h0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f29156j0;
    }

    public CharSequence getError() {
        IndicatorViewController indicatorViewController = this.f29159l;
        if (indicatorViewController.f24877k) {
            return indicatorViewController.f24876j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f29159l.f24879m;
    }

    public int getErrorCurrentTextColors() {
        return this.f29159l.m11063g();
    }

    public Drawable getErrorIconDrawable() {
        return this.f29178u0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f29159l.m11063g();
    }

    public CharSequence getHelperText() {
        IndicatorViewController indicatorViewController = this.f29159l;
        if (indicatorViewController.f24883q) {
            return indicatorViewController.f24882p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f29159l.f24884r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f29111D) {
            return this.f29113E;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f29122I0.m11312h();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f29122I0.m11313i();
    }

    public ColorStateList getHintTextColor() {
        return this.f29184x0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f29156j0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f29156j0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f29175t) {
            return this.f29173s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f29181w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f29179v;
    }

    public CharSequence getPrefixText() {
        return this.f29187z;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f29105A.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f29105A;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f29140V.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f29140V.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f29107B;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f29109C.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f29109C;
    }

    public Typeface getTypeface() {
        return this.f29139U;
    }

    /* JADX INFO: renamed from: h */
    public final int m12863h(int i, boolean z) {
        int compoundPaddingLeft = this.f29155j.getCompoundPaddingLeft() + i;
        return (this.f29187z == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f29105A.getMeasuredWidth()) + this.f29105A.getPaddingLeft();
    }

    /* JADX INFO: renamed from: i */
    public final int m12864i(int i, boolean z) {
        int compoundPaddingRight = i - this.f29155j.getCompoundPaddingRight();
        return (this.f29187z == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.f29105A.getMeasuredWidth() - this.f29105A.getPaddingRight());
    }

    /* JADX INFO: renamed from: j */
    public final boolean m12865j() {
        return this.f29152h0 != 0;
    }

    /* JADX INFO: renamed from: k */
    public boolean m12866k() {
        return this.f29153i.getVisibility() == 0 && this.f29156j0.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m12867l() {
        int i = this.f29125K;
        if (i == 0) {
            this.f29117G = null;
            this.f29119H = null;
        } else if (i == 1) {
            this.f29117G = new MaterialShapeDrawable(this.f29121I);
            this.f29119H = new MaterialShapeDrawable();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(outline.m1603y(new StringBuilder(), this.f29125K, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f29111D || (this.f29117G instanceof CutoutDrawable)) {
                this.f29117G = new MaterialShapeDrawable(this.f29121I);
            } else {
                this.f29117G = new CutoutDrawable(this.f29121I);
            }
            this.f29119H = null;
        }
        EditText editText = this.f29155j;
        if ((editText == null || this.f29117G == null || editText.getBackground() != null || this.f29125K == 0) ? false : true) {
            EditText editText2 = this.f29155j;
            MaterialShapeDrawable materialShapeDrawable = this.f29117G;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            editText2.setBackground(materialShapeDrawable);
        }
        m12855F();
        if (this.f29125K == 1) {
            if (C4799a.m10974Y(getContext())) {
                this.f29127L = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (C4799a.m10973X(getContext())) {
                this.f29127L = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f29155j != null && this.f29125K == 1) {
            if (C4799a.m10974Y(getContext())) {
                EditText editText3 = this.f29155j;
                AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), this.f29155j.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (C4799a.m10973X(getContext())) {
                EditText editText4 = this.f29155j;
                AtomicInteger atomicInteger3 = ViewCompat.f38073a;
                editText4.setPaddingRelative(editText4.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), this.f29155j.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f29125K != 0) {
            m12877x();
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    /* JADX INFO: renamed from: m */
    public final void m12868m() {
        float f;
        float fM11306b;
        float f2;
        float fM11306b2;
        int i;
        float fM11306b3;
        int i2;
        if (m12862g()) {
            RectF rectF = this.f29138T;
            CollapsingTextHelper collapsingTextHelper = this.f29122I0;
            int width = this.f29155j.getWidth();
            int gravity = this.f29155j.getGravity();
            boolean zM11307c = collapsingTextHelper.m11307c(collapsingTextHelper.f25462x);
            collapsingTextHelper.f25464z = zM11307c;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zM11307c) {
                        i2 = collapsingTextHelper.f25443e.left;
                        f2 = i2;
                    } else {
                        f = collapsingTextHelper.f25443e.right;
                        fM11306b = collapsingTextHelper.m11306b();
                    }
                } else if (zM11307c) {
                    f = collapsingTextHelper.f25443e.right;
                    fM11306b = collapsingTextHelper.m11306b();
                } else {
                    i2 = collapsingTextHelper.f25443e.left;
                    f2 = i2;
                }
                rectF.left = f2;
                Rect rect = collapsingTextHelper.f25443e;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    fM11306b2 = (width / 2.0f) + (collapsingTextHelper.m11306b() / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (collapsingTextHelper.f25464z) {
                        fM11306b3 = collapsingTextHelper.m11306b();
                        fM11306b2 = fM11306b3 + f2;
                    } else {
                        i = rect.right;
                        fM11306b2 = i;
                    }
                } else if (collapsingTextHelper.f25464z) {
                    i = rect.right;
                    fM11306b2 = i;
                } else {
                    fM11306b3 = collapsingTextHelper.m11306b();
                    fM11306b2 = fM11306b3 + f2;
                }
                rectF.right = fM11306b2;
                float fM11312h = collapsingTextHelper.m11312h() + collapsingTextHelper.f25443e.top;
                rectF.bottom = fM11312h;
                float f3 = rectF.left;
                float f4 = this.f29123J;
                rectF.left = f3 - f4;
                rectF.top -= f4;
                rectF.right += f4;
                rectF.bottom = fM11312h + f4;
                rectF.offset(-getPaddingLeft(), -getPaddingTop());
                CutoutDrawable cutoutDrawable = (CutoutDrawable) this.f29117G;
                Objects.requireNonNull(cutoutDrawable);
                cutoutDrawable.m11048B(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
            f = width / 2.0f;
            fM11306b = collapsingTextHelper.m11306b() / 2.0f;
            f2 = f - fM11306b;
            rectF.left = f2;
            Rect rect2 = collapsingTextHelper.f25443e;
            rectF.top = rect2.top;
            if (gravity != 17) {
                fM11306b2 = (width / 2.0f) + (collapsingTextHelper.m11306b() / 2.0f);
            } else {
                fM11306b2 = (width / 2.0f) + (collapsingTextHelper.m11306b() / 2.0f);
            }
            rectF.right = fM11306b2;
            float fM11312h2 = collapsingTextHelper.m11312h() + collapsingTextHelper.f25443e.top;
            rectF.bottom = fM11312h2;
            float f5 = rectF.left;
            float f6 = this.f29123J;
            rectF.left = f5 - f6;
            rectF.top -= f6;
            rectF.right += f6;
            rectF.bottom = fM11312h2 + f6;
            rectF.offset(-getPaddingLeft(), -getPaddingTop());
            CutoutDrawable cutoutDrawable2 = (CutoutDrawable) this.f29117G;
            Objects.requireNonNull(cutoutDrawable2);
            cutoutDrawable2.m11048B(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m12869o() {
        m12870p(this.f29156j0, this.f29160l0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f29155j;
        if (editText != null) {
            Rect rect = this.f29136R;
            DescendantOffsetUtils.m11330a(this, editText, rect);
            MaterialShapeDrawable materialShapeDrawable = this.f29119H;
            if (materialShapeDrawable != null) {
                int i5 = rect.bottom;
                materialShapeDrawable.setBounds(rect.left, i5 - this.f29133O, rect.right, i5);
            }
            if (this.f29111D) {
                CollapsingTextHelper collapsingTextHelper = this.f29122I0;
                float textSize = this.f29155j.getTextSize();
                if (collapsingTextHelper.f25447i != textSize) {
                    collapsingTextHelper.f25447i = textSize;
                    collapsingTextHelper.m11316m();
                }
                int gravity = this.f29155j.getGravity();
                this.f29122I0.m11319q((gravity & (-113)) | 48);
                this.f29122I0.m11323u(gravity);
                CollapsingTextHelper collapsingTextHelper2 = this.f29122I0;
                if (this.f29155j == null) {
                    throw new IllegalStateException();
                }
                Rect rect2 = this.f29137S;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                boolean z2 = false;
                boolean z3 = getLayoutDirection() == 1;
                rect2.bottom = rect.bottom;
                int i6 = this.f29125K;
                if (i6 == 1) {
                    rect2.left = m12863h(rect.left, z3);
                    rect2.top = rect.top + this.f29127L;
                    rect2.right = m12864i(rect.right, z3);
                } else if (i6 != 2) {
                    rect2.left = m12863h(rect.left, z3);
                    rect2.top = getPaddingTop();
                    rect2.right = m12864i(rect.right, z3);
                } else {
                    rect2.left = this.f29155j.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m12861f();
                    rect2.right = rect.right - this.f29155j.getPaddingRight();
                }
                Objects.requireNonNull(collapsingTextHelper2);
                int i7 = rect2.left;
                int i8 = rect2.top;
                int i9 = rect2.right;
                int i10 = rect2.bottom;
                if (!CollapsingTextHelper.m11304n(collapsingTextHelper2.f25443e, i7, i8, i9, i10)) {
                    collapsingTextHelper2.f25443e.set(i7, i8, i9, i10);
                    collapsingTextHelper2.f25418E = true;
                    collapsingTextHelper2.m11315l();
                }
                CollapsingTextHelper collapsingTextHelper3 = this.f29122I0;
                if (this.f29155j == null) {
                    throw new IllegalStateException();
                }
                Rect rect3 = this.f29137S;
                TextPaint textPaint = collapsingTextHelper3.f25420G;
                textPaint.setTextSize(collapsingTextHelper3.f25447i);
                textPaint.setTypeface(collapsingTextHelper3.f25458t);
                textPaint.setLetterSpacing(collapsingTextHelper3.f25432S);
                float f = -collapsingTextHelper3.f25420G.ascent();
                rect3.left = this.f29155j.getCompoundPaddingLeft() + rect.left;
                rect3.top = this.f29125K == 1 && this.f29155j.getMinLines() <= 1 ? (int) (rect.centerY() - (f / 2.0f)) : rect.top + this.f29155j.getCompoundPaddingTop();
                rect3.right = rect.right - this.f29155j.getCompoundPaddingRight();
                if (this.f29125K == 1 && this.f29155j.getMinLines() <= 1) {
                    z2 = true;
                }
                int compoundPaddingBottom = z2 ? (int) (rect3.top + f) : rect.bottom - this.f29155j.getCompoundPaddingBottom();
                rect3.bottom = compoundPaddingBottom;
                int i11 = rect3.left;
                int i12 = rect3.top;
                int i13 = rect3.right;
                if (!CollapsingTextHelper.m11304n(collapsingTextHelper3.f25442d, i11, i12, i13, compoundPaddingBottom)) {
                    collapsingTextHelper3.f25442d.set(i11, i12, i13, compoundPaddingBottom);
                    collapsingTextHelper3.f25418E = true;
                    collapsingTextHelper3.m11315l();
                }
                this.f29122I0.m11316m();
                if (!m12862g() || this.f29120H0) {
                    return;
                }
                m12868m();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        EditText editText;
        int iMax;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.f29155j != null && this.f29155j.getMeasuredHeight() < (iMax = Math.max(this.f29151h.getMeasuredHeight(), this.f29149g.getMeasuredHeight()))) {
            this.f29155j.setMinimumHeight(iMax);
            z = true;
        }
        boolean zM12875v = m12875v();
        if (z || zM12875v) {
            this.f29155j.post(new RunnableC5975c());
        }
        if (this.f29177u != null && (editText = this.f29155j) != null) {
            this.f29177u.setGravity(editText.getGravity());
            this.f29177u.setPadding(this.f29155j.getCompoundPaddingLeft(), this.f29155j.getCompoundPaddingTop(), this.f29155j.getCompoundPaddingRight(), this.f29155j.getCompoundPaddingBottom());
        }
        m12850A();
        m12853D();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5980h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5980h c5980h = (C5980h) parcelable;
        super.onRestoreInstanceState(c5980h.f38150g);
        setError(c5980h.f29194h);
        if (c5980h.f29195i) {
            this.f29156j0.post(new RunnableC5974b());
        }
        setHint(c5980h.f29196j);
        setHelperText(c5980h.f29197k);
        setPlaceholderText(c5980h.f29198l);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C5980h c5980h = new C5980h(super.onSaveInstanceState());
        if (this.f29159l.m11061e()) {
            c5980h.f29194h = getError();
        }
        c5980h.f29195i = m12865j() && this.f29156j0.isChecked();
        c5980h.f29196j = getHint();
        c5980h.f29197k = getHelperText();
        c5980h.f29198l = getPlaceholderText();
        return c5980h;
    }

    /* JADX INFO: renamed from: p */
    public final void m12870p(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = C8162a.m16054Y(drawable).mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: r */
    public void m12871r(TextView textView, int i) {
        boolean z = true;
        try {
            C8162a.m16047R(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C8162a.m16047R(textView, 2132017533);
            textView.setTextColor(ContextCompat.m16134b(getContext(), R.color.design_error));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m12872s() {
        if (this.f29167p != null) {
            EditText editText = this.f29155j;
            m12873t(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f29135Q != i) {
            this.f29135Q = i;
            this.f29110C0 = i;
            this.f29114E0 = i;
            this.f29116F0 = i;
            m12858c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(ContextCompat.m16134b(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f29110C0 = defaultColor;
        this.f29135Q = defaultColor;
        this.f29112D0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f29114E0 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.f29116F0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        m12858c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f29125K) {
            return;
        }
        this.f29125K = i;
        if (this.f29155j != null) {
            m12867l();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f29106A0 != i) {
            this.f29106A0 = i;
            m12855F();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f29186y0 = colorStateList.getDefaultColor();
            this.f29118G0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f29188z0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.f29106A0 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.f29106A0 != colorStateList.getDefaultColor()) {
            this.f29106A0 = colorStateList.getDefaultColor();
        }
        m12855F();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f29108B0 != colorStateList) {
            this.f29108B0 = colorStateList;
            m12855F();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f29131N = i;
        m12855F();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f29133O = i;
        m12855F();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f29161m != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f29167p = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.f29139U;
                if (typeface != null) {
                    this.f29167p.setTypeface(typeface);
                }
                this.f29167p.setMaxLines(1);
                this.f29159l.m11057a(this.f29167p, 2);
                ((ViewGroup.MarginLayoutParams) this.f29167p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                m12874u();
                m12872s();
            } else {
                this.f29159l.m11066j(this.f29167p, 2);
                this.f29167p = null;
            }
            this.f29161m = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f29163n != i) {
            if (i > 0) {
                this.f29163n = i;
            } else {
                this.f29163n = -1;
            }
            if (this.f29161m) {
                m12872s();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f29169q != i) {
            this.f29169q = i;
            m12874u();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f29185y != colorStateList) {
            this.f29185y = colorStateList;
            m12874u();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f29171r != i) {
            this.f29171r = i;
            m12874u();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f29183x != colorStateList) {
            this.f29183x = colorStateList;
            m12874u();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f29182w0 = colorStateList;
        this.f29184x0 = colorStateList;
        if (this.f29155j != null) {
            m12878y(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m12848n(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f29156j0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f29156j0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? AppCompatResources.m14707b(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f29152h0;
        this.f29152h0 = i;
        Iterator<InterfaceC5979g> it = this.f29158k0.iterator();
        while (it.hasNext()) {
            it.next().mo11047a(this, i2);
        }
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo11053b(this.f29125K)) {
            getEndIconDelegate().mo11043a();
            m12859d();
        } else {
            StringBuilder sbM1556G = outline.m1556G("The current box background mode ");
            sbM1556G.append(this.f29125K);
            sbM1556G.append(" is not supported by the end icon mode ");
            sbM1556G.append(i);
            throw new IllegalStateException(sbM1556G.toString());
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f29156j0;
        View.OnLongClickListener onLongClickListener = this.f29174s0;
        checkableImageButton.setOnClickListener(onClickListener);
        m12849q(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f29174s0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f29156j0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m12849q(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f29160l0 != colorStateList) {
            this.f29160l0 = colorStateList;
            this.f29162m0 = true;
            m12859d();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f29164n0 != mode) {
            this.f29164n0 = mode;
            this.f29166o0 = true;
            m12859d();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (m12866k() != z) {
            this.f29156j0.setVisibility(z ? 0 : 8);
            m12853D();
            m12875v();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f29159l.f24877k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f29159l.m11065i();
            return;
        }
        IndicatorViewController indicatorViewController = this.f29159l;
        indicatorViewController.m11059c();
        indicatorViewController.f24876j = charSequence;
        indicatorViewController.f24878l.setText(charSequence);
        int i = indicatorViewController.f24874h;
        if (i != 1) {
            indicatorViewController.f24875i = 1;
        }
        indicatorViewController.m11068l(i, indicatorViewController.f24875i, indicatorViewController.m11067k(indicatorViewController.f24878l, charSequence));
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        IndicatorViewController indicatorViewController = this.f29159l;
        indicatorViewController.f24879m = charSequence;
        TextView textView = indicatorViewController.f24878l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        IndicatorViewController indicatorViewController = this.f29159l;
        if (indicatorViewController.f24877k == z) {
            return;
        }
        indicatorViewController.m11059c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(indicatorViewController.f24867a);
            indicatorViewController.f24878l = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            indicatorViewController.f24878l.setTextAlignment(5);
            Typeface typeface = indicatorViewController.f24887u;
            if (typeface != null) {
                indicatorViewController.f24878l.setTypeface(typeface);
            }
            int i = indicatorViewController.f24880n;
            indicatorViewController.f24880n = i;
            TextView textView = indicatorViewController.f24878l;
            if (textView != null) {
                indicatorViewController.f24868b.m12871r(textView, i);
            }
            ColorStateList colorStateList = indicatorViewController.f24881o;
            indicatorViewController.f24881o = colorStateList;
            TextView textView2 = indicatorViewController.f24878l;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            CharSequence charSequence = indicatorViewController.f24879m;
            indicatorViewController.f24879m = charSequence;
            TextView textView3 = indicatorViewController.f24878l;
            if (textView3 != null) {
                textView3.setContentDescription(charSequence);
            }
            indicatorViewController.f24878l.setVisibility(4);
            TextView textView4 = indicatorViewController.f24878l;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            textView4.setAccessibilityLiveRegion(1);
            indicatorViewController.m11057a(indicatorViewController.f24878l, 0);
        } else {
            indicatorViewController.m11065i();
            indicatorViewController.m11066j(indicatorViewController.f24878l, 0);
            indicatorViewController.f24878l = null;
            indicatorViewController.f24868b.m12876w();
            indicatorViewController.f24868b.m12855F();
        }
        indicatorViewController.f24877k = z;
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? AppCompatResources.m14707b(getContext(), i) : null);
        m12870p(this.f29178u0, this.f29180v0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f29178u0;
        View.OnLongClickListener onLongClickListener = this.f29176t0;
        checkableImageButton.setOnClickListener(onClickListener);
        m12849q(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f29176t0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f29178u0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m12849q(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f29180v0 = colorStateList;
        Drawable drawable = this.f29178u0.getDrawable();
        if (drawable != null) {
            drawable = C8162a.m16054Y(drawable).mutate();
            drawable.setTintList(colorStateList);
        }
        if (this.f29178u0.getDrawable() != drawable) {
            this.f29178u0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f29178u0.getDrawable();
        if (drawable != null) {
            drawable = C8162a.m16054Y(drawable).mutate();
            drawable.setTintMode(mode);
        }
        if (this.f29178u0.getDrawable() != drawable) {
            this.f29178u0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        IndicatorViewController indicatorViewController = this.f29159l;
        indicatorViewController.f24880n = i;
        TextView textView = indicatorViewController.f24878l;
        if (textView != null) {
            indicatorViewController.f24868b.m12871r(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        IndicatorViewController indicatorViewController = this.f29159l;
        indicatorViewController.f24881o = colorStateList;
        TextView textView = indicatorViewController.f24878l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f29124J0 != z) {
            this.f29124J0 = z;
            m12878y(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.f29159l.f24883q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.f29159l.f24883q) {
            setHelperTextEnabled(true);
        }
        IndicatorViewController indicatorViewController = this.f29159l;
        indicatorViewController.m11059c();
        indicatorViewController.f24882p = charSequence;
        indicatorViewController.f24884r.setText(charSequence);
        int i = indicatorViewController.f24874h;
        if (i != 2) {
            indicatorViewController.f24875i = 2;
        }
        indicatorViewController.m11068l(i, indicatorViewController.f24875i, indicatorViewController.m11067k(indicatorViewController.f24884r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        IndicatorViewController indicatorViewController = this.f29159l;
        indicatorViewController.f24886t = colorStateList;
        TextView textView = indicatorViewController.f24884r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        IndicatorViewController indicatorViewController = this.f29159l;
        if (indicatorViewController.f24883q == z) {
            return;
        }
        indicatorViewController.m11059c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(indicatorViewController.f24867a);
            indicatorViewController.f24884r = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            indicatorViewController.f24884r.setTextAlignment(5);
            Typeface typeface = indicatorViewController.f24887u;
            if (typeface != null) {
                indicatorViewController.f24884r.setTypeface(typeface);
            }
            indicatorViewController.f24884r.setVisibility(4);
            TextView textView = indicatorViewController.f24884r;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            textView.setAccessibilityLiveRegion(1);
            int i = indicatorViewController.f24885s;
            indicatorViewController.f24885s = i;
            TextView textView2 = indicatorViewController.f24884r;
            if (textView2 != null) {
                C8162a.m16047R(textView2, i);
            }
            ColorStateList colorStateList = indicatorViewController.f24886t;
            indicatorViewController.f24886t = colorStateList;
            TextView textView3 = indicatorViewController.f24884r;
            if (textView3 != null && colorStateList != null) {
                textView3.setTextColor(colorStateList);
            }
            indicatorViewController.m11057a(indicatorViewController.f24884r, 1);
        } else {
            indicatorViewController.m11059c();
            int i2 = indicatorViewController.f24874h;
            if (i2 == 2) {
                indicatorViewController.f24875i = 0;
            }
            indicatorViewController.m11068l(i2, indicatorViewController.f24875i, indicatorViewController.m11067k(indicatorViewController.f24884r, null));
            indicatorViewController.m11066j(indicatorViewController.f24884r, 1);
            indicatorViewController.f24884r = null;
            indicatorViewController.f24868b.m12876w();
            indicatorViewController.f24868b.m12855F();
        }
        indicatorViewController.f24883q = z;
    }

    public void setHelperTextTextAppearance(int i) {
        IndicatorViewController indicatorViewController = this.f29159l;
        indicatorViewController.f24885s = i;
        TextView textView = indicatorViewController.f24884r;
        if (textView != null) {
            C8162a.m16047R(textView, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f29111D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f29126K0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f29111D) {
            this.f29111D = z;
            if (z) {
                CharSequence hint = this.f29155j.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f29113E)) {
                        setHint(hint);
                    }
                    this.f29155j.setHint((CharSequence) null);
                }
                this.f29115F = true;
            } else {
                this.f29115F = false;
                if (!TextUtils.isEmpty(this.f29113E) && TextUtils.isEmpty(this.f29155j.getHint())) {
                    this.f29155j.setHint(this.f29113E);
                }
                setHintInternal(null);
            }
            if (this.f29155j != null) {
                m12877x();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f29122I0.m11317o(i);
        this.f29184x0 = this.f29122I0.f25450l;
        if (this.f29155j != null) {
            m12878y(false, false);
            m12877x();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f29184x0 != colorStateList) {
            if (this.f29182w0 == null) {
                CollapsingTextHelper collapsingTextHelper = this.f29122I0;
                if (collapsingTextHelper.f25450l != colorStateList) {
                    collapsingTextHelper.f25450l = colorStateList;
                    collapsingTextHelper.m11316m();
                }
            }
            this.f29184x0 = colorStateList;
            if (this.f29155j != null) {
                m12878y(false, false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? AppCompatResources.m14707b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f29152h0 != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f29160l0 = colorStateList;
        this.f29162m0 = true;
        m12859d();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f29164n0 = mode;
        this.f29166o0 = true;
        m12859d();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f29175t && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f29175t) {
                setPlaceholderTextEnabled(true);
            }
            this.f29173s = charSequence;
        }
        EditText editText = this.f29155j;
        m12879z(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f29181w = i;
        TextView textView = this.f29177u;
        if (textView != null) {
            C8162a.m16047R(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f29179v != colorStateList) {
            this.f29179v = colorStateList;
            TextView textView = this.f29177u;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f29187z = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f29105A.setText(charSequence);
        m12851B();
    }

    public void setPrefixTextAppearance(int i) {
        C8162a.m16047R(this.f29105A, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f29105A.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f29140V.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AppCompatResources.m14707b(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f29140V;
        View.OnLongClickListener onLongClickListener = this.f29148f0;
        checkableImageButton.setOnClickListener(onClickListener);
        m12849q(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f29148f0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f29140V;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m12849q(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f29141W != colorStateList) {
            this.f29141W = colorStateList;
            this.f29142a0 = true;
            m12860e(this.f29140V, true, colorStateList, this.f29144c0, this.f29143b0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f29143b0 != mode) {
            this.f29143b0 = mode;
            this.f29144c0 = true;
            m12860e(this.f29140V, this.f29142a0, this.f29141W, true, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        if ((this.f29140V.getVisibility() == 0) != z) {
            this.f29140V.setVisibility(z ? 0 : 8);
            m12850A();
            m12875v();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f29107B = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f29109C.setText(charSequence);
        m12854E();
    }

    public void setSuffixTextAppearance(int i) {
        C8162a.m16047R(this.f29109C, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f29109C.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C5977e c5977e) {
        EditText editText = this.f29155j;
        if (editText != null) {
            ViewCompat.m16327u(editText, c5977e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f29139U) {
            this.f29139U = typeface;
            this.f29122I0.m11305A(typeface);
            IndicatorViewController indicatorViewController = this.f29159l;
            if (typeface != indicatorViewController.f24887u) {
                indicatorViewController.f24887u = typeface;
                TextView textView = indicatorViewController.f24878l;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = indicatorViewController.f24884r;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f29167p;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m12873t(int i) {
        boolean z = this.f29165o;
        int i2 = this.f29163n;
        if (i2 == -1) {
            this.f29167p.setText(String.valueOf(i));
            this.f29167p.setContentDescription(null);
            this.f29165o = false;
        } else {
            this.f29165o = i > i2;
            Context context = getContext();
            this.f29167p.setContentDescription(context.getString(this.f29165o ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.f29163n)));
            if (z != this.f29165o) {
                m12874u();
            }
            BidiFormatter bidiFormatterM16209c = BidiFormatter.m16209c();
            TextView textView = this.f29167p;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f29163n));
            textView.setText(string != null ? bidiFormatterM16209c.m16211e(string, bidiFormatterM16209c.f37946h, true).toString() : null);
        }
        if (this.f29155j == null || z == this.f29165o) {
            return;
        }
        m12878y(false, false);
        m12855F();
        m12876w();
    }

    /* JADX INFO: renamed from: u */
    public final void m12874u() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f29167p;
        if (textView != null) {
            m12871r(textView, this.f29165o ? this.f29169q : this.f29171r);
            if (!this.f29165o && (colorStateList2 = this.f29183x) != null) {
                this.f29167p.setTextColor(colorStateList2);
            }
            if (!this.f29165o || (colorStateList = this.f29185y) == null) {
                return;
            }
            this.f29167p.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX INFO: renamed from: v */
    public final boolean m12875v() {
        boolean z;
        if (this.f29155j == null) {
            return false;
        }
        boolean z2 = true;
        if (!(getStartIconDrawable() == null && this.f29187z == null) && this.f29149g.getMeasuredWidth() > 0) {
            int measuredWidth = this.f29149g.getMeasuredWidth() - this.f29155j.getPaddingLeft();
            if (this.f29145d0 == null || this.f29146e0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f29145d0 = colorDrawable;
                this.f29146e0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f29155j.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.f29145d0;
            if (drawable != drawable2) {
                this.f29155j.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            } else {
                z = false;
            }
        } else if (this.f29145d0 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f29155j.getCompoundDrawablesRelative();
            this.f29155j.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
            this.f29145d0 = null;
            z = true;
        } else {
            z = false;
        }
        if ((this.f29178u0.getVisibility() == 0 || ((m12865j() && m12866k()) || this.f29107B != null)) && this.f29151h.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.f29109C.getMeasuredWidth() - this.f29155j.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()).getMarginStart() + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.f29155j.getCompoundDrawablesRelative();
            Drawable drawable3 = this.f29168p0;
            if (drawable3 == null || this.f29170q0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f29168p0 = colorDrawable2;
                    this.f29170q0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = compoundDrawablesRelative3[2];
                Drawable drawable5 = this.f29168p0;
                if (drawable4 != drawable5) {
                    this.f29172r0 = compoundDrawablesRelative3[2];
                    this.f29155j.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.f29170q0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f29155j.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f29168p0, compoundDrawablesRelative3[3]);
            }
        } else {
            if (this.f29168p0 == null) {
                return z;
            }
            Drawable[] compoundDrawablesRelative4 = this.f29155j.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f29168p0) {
                this.f29155j.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f29172r0, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.f29168p0 = null;
        }
        return z2;
    }

    /* JADX INFO: renamed from: w */
    public void m12876w() {
        Drawable background;
        TextView textView;
        EditText editText = this.f29155j;
        if (editText == null || this.f29125K != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (DrawableUtils.m14885a(background)) {
            background = background.mutate();
        }
        if (this.f29159l.m11061e()) {
            background.setColorFilter(AppCompatDrawableManager.m14905c(this.f29159l.m11063g(), PorterDuff.Mode.SRC_IN));
        } else if (this.f29165o && (textView = this.f29167p) != null) {
            background.setColorFilter(AppCompatDrawableManager.m14905c(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            C8162a.m16067l(background);
            this.f29155j.refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m12877x() {
        if (this.f29125K != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f29147f.getLayoutParams();
            int iM12861f = m12861f();
            if (iM12861f != layoutParams.topMargin) {
                layoutParams.topMargin = iM12861f;
                this.f29147f.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m12878y(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f29155j;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f29155j;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean zM11061e = this.f29159l.m11061e();
        ColorStateList colorStateList2 = this.f29182w0;
        if (colorStateList2 != null) {
            this.f29122I0.m11318p(colorStateList2);
            this.f29122I0.m11322t(this.f29182w0);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f29182w0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f29118G0) : this.f29118G0;
            this.f29122I0.m11318p(ColorStateList.valueOf(colorForState));
            this.f29122I0.m11322t(ColorStateList.valueOf(colorForState));
        } else if (zM11061e) {
            CollapsingTextHelper collapsingTextHelper = this.f29122I0;
            TextView textView2 = this.f29159l.f24878l;
            collapsingTextHelper.m11318p(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.f29165o && (textView = this.f29167p) != null) {
            this.f29122I0.m11318p(textView.getTextColors());
        } else if (z4 && (colorStateList = this.f29184x0) != null) {
            this.f29122I0.m11318p(colorStateList);
        }
        if (z3 || !this.f29124J0 || (isEnabled() && z4)) {
            if (z2 || this.f29120H0) {
                ValueAnimator valueAnimator = this.f29128L0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f29128L0.cancel();
                }
                if (z && this.f29126K0) {
                    m12857b(1.0f);
                } else {
                    this.f29122I0.m11325w(1.0f);
                }
                this.f29120H0 = false;
                if (m12862g()) {
                    m12868m();
                }
                EditText editText3 = this.f29155j;
                m12879z(editText3 != null ? editText3.getText().length() : 0);
                m12851B();
                m12854E();
                return;
            }
            return;
        }
        if (z2 || !this.f29120H0) {
            ValueAnimator valueAnimator2 = this.f29128L0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f29128L0.cancel();
            }
            if (z && this.f29126K0) {
                m12857b(0.0f);
            } else {
                this.f29122I0.m11325w(0.0f);
            }
            if (m12862g() && (!((CutoutDrawable) this.f29117G).f24834E.isEmpty()) && m12862g()) {
                ((CutoutDrawable) this.f29117G).m11048B(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f29120H0 = true;
            TextView textView3 = this.f29177u;
            if (textView3 != null && this.f29175t) {
                textView3.setText((CharSequence) null);
                this.f29177u.setVisibility(4);
            }
            m12851B();
            m12854E();
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m12879z(int i) {
        if (i != 0 || this.f29120H0) {
            TextView textView = this.f29177u;
            if (textView == null || !this.f29175t) {
                return;
            }
            textView.setText((CharSequence) null);
            this.f29177u.setVisibility(4);
            return;
        }
        TextView textView2 = this.f29177u;
        if (textView2 == null || !this.f29175t) {
            return;
        }
        textView2.setText(this.f29173s);
        this.f29177u.setVisibility(0);
        this.f29177u.bringToFront();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f29156j0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f29156j0.setImageDrawable(drawable);
        m12869o();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f29140V.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f29140V.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m12870p(this.f29140V, this.f29141W);
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(MaterialThemeOverlay.m11090a(context, attributeSet, i, 2132017855), attributeSet, i);
        this.f29159l = new IndicatorViewController(this);
        this.f29136R = new Rect();
        this.f29137S = new Rect();
        this.f29138T = new RectF();
        this.f29150g0 = new LinkedHashSet<>();
        this.f29152h0 = 0;
        SparseArray<EndIconDelegate> sparseArray = new SparseArray<>();
        this.f29154i0 = sparseArray;
        this.f29158k0 = new LinkedHashSet<>();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.f29122I0 = collapsingTextHelper;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f29147f = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f29149g = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.f29151h = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f29153i = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = AnimationUtils.f24793a;
        collapsingTextHelper.f25422I = timeInterpolator;
        collapsingTextHelper.m11316m();
        collapsingTextHelper.f25421H = timeInterpolator;
        collapsingTextHelper.m11316m();
        collapsingTextHelper.m11319q(8388659);
        int[] iArr = C4801b.f24744P;
        ThemeEnforcement.m11344a(context2, attributeSet, i, 2132017855);
        ThemeEnforcement.m11345b(context2, attributeSet, iArr, i, 2132017855, 18, 16, 31, 36, 40);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, 2132017855);
        TintTypedArray tintTypedArray = new TintTypedArray(context2, typedArrayObtainStyledAttributes);
        this.f29111D = tintTypedArray.m14999a(39, true);
        setHint(tintTypedArray.m15013o(2));
        this.f29126K0 = tintTypedArray.m14999a(38, true);
        this.f29124J0 = tintTypedArray.m14999a(33, true);
        this.f29121I = ShapeAppearanceModel.m11392b(context2, attributeSet, i, 2132017855).m11398a();
        this.f29123J = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f29127L = tintTypedArray.m15003e(5, 0);
        this.f29131N = tintTypedArray.m15004f(12, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f29133O = tintTypedArray.m15004f(13, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f29129M = this.f29131N;
        float fM15002d = tintTypedArray.m15002d(9, -1.0f);
        float fM15002d2 = tintTypedArray.m15002d(8, -1.0f);
        float fM15002d3 = tintTypedArray.m15002d(6, -1.0f);
        float fM15002d4 = tintTypedArray.m15002d(7, -1.0f);
        ShapeAppearanceModel shapeAppearanceModel = this.f29121I;
        Objects.requireNonNull(shapeAppearanceModel);
        ShapeAppearanceModel.b bVar = new ShapeAppearanceModel.b(shapeAppearanceModel);
        if (fM15002d >= 0.0f) {
            bVar.m11402f(fM15002d);
        }
        if (fM15002d2 >= 0.0f) {
            bVar.m11403g(fM15002d2);
        }
        if (fM15002d3 >= 0.0f) {
            bVar.m11401e(fM15002d3);
        }
        if (fM15002d4 >= 0.0f) {
            bVar.m11400d(fM15002d4);
        }
        this.f29121I = bVar.m11398a();
        ColorStateList colorStateListM10962M = C4799a.m10962M(context2, tintTypedArray, 3);
        if (colorStateListM10962M != null) {
            int defaultColor = colorStateListM10962M.getDefaultColor();
            this.f29110C0 = defaultColor;
            this.f29135Q = defaultColor;
            if (colorStateListM10962M.isStateful()) {
                i2 = -1;
                this.f29112D0 = colorStateListM10962M.getColorForState(new int[]{-16842910}, -1);
                this.f29114E0 = colorStateListM10962M.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                this.f29116F0 = colorStateListM10962M.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                i2 = -1;
                this.f29114E0 = this.f29110C0;
                ColorStateList colorStateListM14706a = AppCompatResources.m14706a(context2, R.color.mtrl_filled_background_color);
                this.f29112D0 = colorStateListM14706a.getColorForState(new int[]{-16842910}, -1);
                this.f29116F0 = colorStateListM14706a.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
        } else {
            i2 = -1;
            this.f29135Q = 0;
            this.f29110C0 = 0;
            this.f29112D0 = 0;
            this.f29114E0 = 0;
            this.f29116F0 = 0;
        }
        if (tintTypedArray.m15014p(1)) {
            ColorStateList colorStateListM15001c = tintTypedArray.m15001c(1);
            this.f29184x0 = colorStateListM15001c;
            this.f29182w0 = colorStateListM15001c;
        }
        ColorStateList colorStateListM10962M2 = C4799a.m10962M(context2, tintTypedArray, 10);
        this.f29106A0 = tintTypedArray.m15000b(10, 0);
        this.f29186y0 = ContextCompat.m16134b(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.f29118G0 = ContextCompat.m16134b(context2, R.color.mtrl_textinput_disabled_color);
        this.f29188z0 = ContextCompat.m16134b(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM10962M2 != null) {
            setBoxStrokeColorStateList(colorStateListM10962M2);
        }
        if (tintTypedArray.m15014p(11)) {
            setBoxStrokeErrorColor(C4799a.m10962M(context2, tintTypedArray, 11));
        }
        if (tintTypedArray.m15011m(40, i2) != i2) {
            setHintTextAppearance(tintTypedArray.m15011m(40, 0));
        }
        int iM15011m = tintTypedArray.m15011m(31, 0);
        CharSequence charSequenceM15013o = tintTypedArray.m15013o(26);
        boolean zM14999a = tintTypedArray.m14999a(27, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, (ViewGroup) linearLayout2, false);
        this.f29178u0 = checkableImageButton;
        checkableImageButton.setId(R.id.text_input_error_icon);
        checkableImageButton.setVisibility(8);
        if (C4799a.m10973X(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        if (tintTypedArray.m15014p(28)) {
            setErrorIconDrawable(tintTypedArray.m15005g(28));
        }
        if (tintTypedArray.m15014p(29)) {
            setErrorIconTintList(C4799a.m10962M(context2, tintTypedArray, 29));
        }
        if (tintTypedArray.m15014p(30)) {
            setErrorIconTintMode(C4799a.m10999l0(tintTypedArray.m15008j(30, i2), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iM15011m2 = tintTypedArray.m15011m(36, 0);
        boolean zM14999a2 = tintTypedArray.m14999a(35, false);
        CharSequence charSequenceM15013o2 = tintTypedArray.m15013o(34);
        int iM15011m3 = tintTypedArray.m15011m(48, 0);
        CharSequence charSequenceM15013o3 = tintTypedArray.m15013o(47);
        int iM15011m4 = tintTypedArray.m15011m(51, 0);
        CharSequence charSequenceM15013o4 = tintTypedArray.m15013o(50);
        int iM15011m5 = tintTypedArray.m15011m(61, 0);
        CharSequence charSequenceM15013o5 = tintTypedArray.m15013o(60);
        boolean zM14999a3 = tintTypedArray.m14999a(14, false);
        setCounterMaxLength(tintTypedArray.m15008j(15, -1));
        this.f29171r = tintTypedArray.m15011m(18, 0);
        this.f29169q = tintTypedArray.m15011m(16, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) linearLayout, false);
        this.f29140V = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (C4799a.m10973X(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginEnd(0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (tintTypedArray.m15014p(57)) {
            setStartIconDrawable(tintTypedArray.m15005g(57));
            if (tintTypedArray.m15014p(56)) {
                setStartIconContentDescription(tintTypedArray.m15013o(56));
            }
            setStartIconCheckable(tintTypedArray.m14999a(55, true));
        }
        if (tintTypedArray.m15014p(58)) {
            setStartIconTintList(C4799a.m10962M(context2, tintTypedArray, 58));
        }
        if (tintTypedArray.m15014p(59)) {
            setStartIconTintMode(C4799a.m10999l0(tintTypedArray.m15008j(59, -1), null));
        }
        setBoxBackgroundMode(tintTypedArray.m15008j(4, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.f29156j0 = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        if (C4799a.m10973X(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton3.getLayoutParams()).setMarginStart(0);
        }
        sparseArray.append(-1, new CustomEndIconDelegate(this));
        sparseArray.append(0, new NoEndIconDelegate(this));
        sparseArray.append(1, new PasswordToggleEndIconDelegate(this));
        sparseArray.append(2, new ClearTextEndIconDelegate(this));
        sparseArray.append(3, new DropdownMenuEndIconDelegate(this));
        if (tintTypedArray.m15014p(23)) {
            setEndIconMode(tintTypedArray.m15008j(23, 0));
            if (tintTypedArray.m15014p(22)) {
                setEndIconDrawable(tintTypedArray.m15005g(22));
            }
            if (tintTypedArray.m15014p(21)) {
                setEndIconContentDescription(tintTypedArray.m15013o(21));
            }
            setEndIconCheckable(tintTypedArray.m14999a(20, true));
        } else if (tintTypedArray.m15014p(44)) {
            setEndIconMode(tintTypedArray.m14999a(44, false) ? 1 : 0);
            setEndIconDrawable(tintTypedArray.m15005g(43));
            setEndIconContentDescription(tintTypedArray.m15013o(42));
            if (tintTypedArray.m15014p(45)) {
                setEndIconTintList(C4799a.m10962M(context2, tintTypedArray, 45));
            }
            if (tintTypedArray.m15014p(46)) {
                setEndIconTintMode(C4799a.m10999l0(tintTypedArray.m15008j(46, -1), null));
            }
        }
        if (!tintTypedArray.m15014p(44)) {
            if (tintTypedArray.m15014p(24)) {
                setEndIconTintList(C4799a.m10962M(context2, tintTypedArray, 24));
            }
            if (tintTypedArray.m15014p(25)) {
                setEndIconTintMode(C4799a.m10999l0(tintTypedArray.m15008j(25, -1), null));
            }
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.f29105A = appCompatTextView;
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        linearLayout.addView(checkableImageButton2);
        linearLayout.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2);
        this.f29109C = appCompatTextView2;
        appCompatTextView2.setId(R.id.textinput_suffix_text);
        appCompatTextView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        appCompatTextView2.setAccessibilityLiveRegion(1);
        linearLayout2.addView(appCompatTextView2);
        linearLayout2.addView(checkableImageButton);
        linearLayout2.addView(frameLayout2);
        setHelperTextEnabled(zM14999a2);
        setHelperText(charSequenceM15013o2);
        setHelperTextTextAppearance(iM15011m2);
        setErrorEnabled(zM14999a);
        setErrorTextAppearance(iM15011m);
        setErrorContentDescription(charSequenceM15013o);
        setCounterTextAppearance(this.f29171r);
        setCounterOverflowTextAppearance(this.f29169q);
        setPlaceholderText(charSequenceM15013o3);
        setPlaceholderTextAppearance(iM15011m3);
        setPrefixText(charSequenceM15013o4);
        setPrefixTextAppearance(iM15011m4);
        setSuffixText(charSequenceM15013o5);
        setSuffixTextAppearance(iM15011m5);
        if (tintTypedArray.m15014p(32)) {
            setErrorTextColor(tintTypedArray.m15001c(32));
        }
        if (tintTypedArray.m15014p(37)) {
            setHelperTextColor(tintTypedArray.m15001c(37));
        }
        if (tintTypedArray.m15014p(41)) {
            setHintTextColor(tintTypedArray.m15001c(41));
        }
        if (tintTypedArray.m15014p(19)) {
            setCounterTextColor(tintTypedArray.m15001c(19));
        }
        if (tintTypedArray.m15014p(17)) {
            setCounterOverflowTextColor(tintTypedArray.m15001c(17));
        }
        if (tintTypedArray.m15014p(49)) {
            setPlaceholderTextColor(tintTypedArray.m15001c(49));
        }
        if (tintTypedArray.m15014p(52)) {
            setPrefixTextColor(tintTypedArray.m15001c(52));
        }
        if (tintTypedArray.m15014p(62)) {
            setSuffixTextColor(tintTypedArray.m15001c(62));
        }
        setCounterEnabled(zM14999a3);
        setEnabled(tintTypedArray.m14999a(0, true));
        typedArrayObtainStyledAttributes.recycle();
        setImportantForAccessibility(2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26 || i3 < 26) {
            return;
        }
        setImportantForAutofill(1);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f29178u0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f29159l.f24877k);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f29156j0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f29156j0.setImageDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
