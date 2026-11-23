package p007c.p190n.p194b.p334e.p338c0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.p337c.AnimationUtils;
import p007c.p190n.p194b.p334e.p357q.ElevationOverlayProvider;
import p007c.p190n.p194b.p334e.p360t.TextWatcherAdapter;
import p007c.p190n.p194b.p334e.p362v.MaterialAttributes;
import p007c.p190n.p194b.p334e.p365y.CornerSize;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;

/* JADX INFO: renamed from: c.n.b.e.c0.h, reason: use source file name */
/* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class DropdownMenuEndIconDelegate extends EndIconDelegate {

    /* JADX INFO: renamed from: d */
    public final TextWatcher f24836d;

    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener f24837e;

    /* JADX INFO: renamed from: f */
    public final TextInputLayout.C5977e f24838f;

    /* JADX INFO: renamed from: g */
    public final TextInputLayout.InterfaceC5978f f24839g;

    /* JADX INFO: renamed from: h */
    @SuppressLint({"ClickableViewAccessibility"})
    public final TextInputLayout.InterfaceC5979g f24840h;

    /* JADX INFO: renamed from: i */
    public boolean f24841i;

    /* JADX INFO: renamed from: j */
    public boolean f24842j;

    /* JADX INFO: renamed from: k */
    public long f24843k;

    /* JADX INFO: renamed from: l */
    public StateListDrawable f24844l;

    /* JADX INFO: renamed from: m */
    public MaterialShapeDrawable f24845m;

    /* JADX INFO: renamed from: n */
    public AccessibilityManager f24846n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f24847o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f24848p;

    /* JADX INFO: renamed from: c.n.b.e.c0.h$a */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    public class a extends TextWatcherAdapter {

        /* JADX INFO: renamed from: c.n.b.e.c0.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
        public class RunnableC8517a implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ AutoCompleteTextView f24850f;

            public RunnableC8517a(AutoCompleteTextView autoCompleteTextView) {
                this.f24850f = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.f24850f.isPopupShowing();
                DropdownMenuEndIconDelegate.m11051f(DropdownMenuEndIconDelegate.this, zIsPopupShowing);
                DropdownMenuEndIconDelegate.this.f24841i = zIsPopupShowing;
            }
        }

        public a() {
        }

        @Override // p007c.p190n.p194b.p334e.p360t.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextViewM11049d = DropdownMenuEndIconDelegate.m11049d(DropdownMenuEndIconDelegate.this.f24864a.getEditText());
            if (DropdownMenuEndIconDelegate.this.f24846n.isTouchExplorationEnabled() && DropdownMenuEndIconDelegate.m11050e(autoCompleteTextViewM11049d) && !DropdownMenuEndIconDelegate.this.f24866c.hasFocus()) {
                autoCompleteTextViewM11049d.dismissDropDown();
            }
            autoCompleteTextViewM11049d.post(new RunnableC8517a(autoCompleteTextViewM11049d));
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.c0.h$b */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            DropdownMenuEndIconDelegate.this.f24864a.setEndIconActivated(z);
            if (z) {
                return;
            }
            DropdownMenuEndIconDelegate.m11051f(DropdownMenuEndIconDelegate.this, false);
            DropdownMenuEndIconDelegate.this.f24841i = false;
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.c0.h$c */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    public class c extends TextInputLayout.C5977e {
        public c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.C5977e, p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: d */
        public void mo382d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            boolean zIsShowingHintText;
            super.mo382d(view, accessibilityNodeInfoCompat);
            if (!DropdownMenuEndIconDelegate.m11050e(DropdownMenuEndIconDelegate.this.f24864a.getEditText())) {
                accessibilityNodeInfoCompat.f38018b.setClassName(Spinner.class.getName());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                zIsShowingHintText = accessibilityNodeInfoCompat.f38018b.isShowingHintText();
            } else {
                Bundle bundleM16265h = accessibilityNodeInfoCompat.m16265h();
                zIsShowingHintText = bundleM16265h != null && (bundleM16265h.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
            }
            if (zIsShowingHintText) {
                accessibilityNodeInfoCompat.m16274r(null);
            }
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: e */
        public void mo11056e(View view, AccessibilityEvent accessibilityEvent) {
            this.f37977b.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView autoCompleteTextViewM11049d = DropdownMenuEndIconDelegate.m11049d(DropdownMenuEndIconDelegate.this.f24864a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && DropdownMenuEndIconDelegate.this.f24846n.isTouchExplorationEnabled() && !DropdownMenuEndIconDelegate.m11050e(DropdownMenuEndIconDelegate.this.f24864a.getEditText())) {
                DropdownMenuEndIconDelegate.m11052g(DropdownMenuEndIconDelegate.this, autoCompleteTextViewM11049d);
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.c0.h$d */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    public class d implements TextInputLayout.InterfaceC5978f {
        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC5978f
        /* JADX INFO: renamed from: a */
        public void mo11046a(TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextViewM11049d = DropdownMenuEndIconDelegate.m11049d(textInputLayout.getEditText());
            DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
            int boxBackgroundMode = dropdownMenuEndIconDelegate.f24864a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextViewM11049d.setDropDownBackgroundDrawable(dropdownMenuEndIconDelegate.f24845m);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextViewM11049d.setDropDownBackgroundDrawable(dropdownMenuEndIconDelegate.f24844l);
            }
            DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate2 = DropdownMenuEndIconDelegate.this;
            Objects.requireNonNull(dropdownMenuEndIconDelegate2);
            if (!(autoCompleteTextViewM11049d.getKeyListener() != null)) {
                int boxBackgroundMode2 = dropdownMenuEndIconDelegate2.f24864a.getBoxBackgroundMode();
                MaterialShapeDrawable boxBackground = dropdownMenuEndIconDelegate2.f24864a.getBoxBackground();
                int iM10960K = C4799a.m10960K(autoCompleteTextViewM11049d, R.attr.colorControlHighlight);
                int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[0]};
                if (boxBackgroundMode2 == 2) {
                    int iM10960K2 = C4799a.m10960K(autoCompleteTextViewM11049d, R.attr.colorSurface);
                    MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(boxBackground.f25574h.f25594a);
                    int iM10989g0 = C4799a.m10989g0(iM10960K, iM10960K2, 0.1f);
                    materialShapeDrawable.m11381q(new ColorStateList(iArr, new int[]{iM10989g0, 0}));
                    materialShapeDrawable.setTint(iM10960K2);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM10989g0, iM10960K2});
                    MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(boxBackground.f25574h.f25594a);
                    materialShapeDrawable2.setTint(-1);
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable, materialShapeDrawable2), boxBackground});
                    AtomicInteger atomicInteger = ViewCompat.f38073a;
                    autoCompleteTextViewM11049d.setBackground(layerDrawable);
                } else if (boxBackgroundMode2 == 1) {
                    int boxBackgroundColor = dropdownMenuEndIconDelegate2.f24864a.getBoxBackgroundColor();
                    RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{C4799a.m10989g0(iM10960K, boxBackgroundColor, 0.1f), boxBackgroundColor}), boxBackground, boxBackground);
                    AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                    autoCompleteTextViewM11049d.setBackground(rippleDrawable);
                }
            }
            DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate3 = DropdownMenuEndIconDelegate.this;
            Objects.requireNonNull(dropdownMenuEndIconDelegate3);
            autoCompleteTextViewM11049d.setOnTouchListener(new DropdownMenuEndIconDelegate3(dropdownMenuEndIconDelegate3, autoCompleteTextViewM11049d));
            autoCompleteTextViewM11049d.setOnFocusChangeListener(dropdownMenuEndIconDelegate3.f24837e);
            autoCompleteTextViewM11049d.setOnDismissListener(new DropdownMenuEndIconDelegate4(dropdownMenuEndIconDelegate3));
            autoCompleteTextViewM11049d.setThreshold(0);
            autoCompleteTextViewM11049d.removeTextChangedListener(DropdownMenuEndIconDelegate.this.f24836d);
            autoCompleteTextViewM11049d.addTextChangedListener(DropdownMenuEndIconDelegate.this.f24836d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!(autoCompleteTextViewM11049d.getKeyListener() != null)) {
                CheckableImageButton checkableImageButton = DropdownMenuEndIconDelegate.this.f24866c;
                AtomicInteger atomicInteger3 = ViewCompat.f38073a;
                checkableImageButton.setImportantForAccessibility(2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(DropdownMenuEndIconDelegate.this.f24838f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.c0.h$e */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    public class e implements TextInputLayout.InterfaceC5979g {

        /* JADX INFO: renamed from: c.n.b.e.c0.h$e$a */
        /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ AutoCompleteTextView f24856f;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.f24856f = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f24856f.removeTextChangedListener(DropdownMenuEndIconDelegate.this.f24836d);
            }
        }

        public e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC5979g
        /* JADX INFO: renamed from: a */
        public void mo11047a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i != 3) {
                return;
            }
            autoCompleteTextView.post(new a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == DropdownMenuEndIconDelegate.this.f24837e) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            autoCompleteTextView.setOnDismissListener(null);
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.c0.h$f */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DropdownMenuEndIconDelegate.m11052g(DropdownMenuEndIconDelegate.this, (AutoCompleteTextView) DropdownMenuEndIconDelegate.this.f24864a.getEditText());
        }
    }

    public DropdownMenuEndIconDelegate(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f24836d = new a();
        this.f24837e = new b();
        this.f24838f = new c(this.f24864a);
        this.f24839g = new d();
        this.f24840h = new e();
        this.f24841i = false;
        this.f24842j = false;
        this.f24843k = Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: d */
    public static AutoCompleteTextView m11049d(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m11050e(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* JADX INFO: renamed from: f */
    public static void m11051f(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, boolean z) {
        if (dropdownMenuEndIconDelegate.f24842j != z) {
            dropdownMenuEndIconDelegate.f24842j = z;
            dropdownMenuEndIconDelegate.f24848p.cancel();
            dropdownMenuEndIconDelegate.f24847o.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m11052g(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(dropdownMenuEndIconDelegate);
        if (autoCompleteTextView == null) {
            return;
        }
        if (dropdownMenuEndIconDelegate.m11055i()) {
            dropdownMenuEndIconDelegate.f24841i = false;
        }
        if (dropdownMenuEndIconDelegate.f24841i) {
            dropdownMenuEndIconDelegate.f24841i = false;
            return;
        }
        boolean z = dropdownMenuEndIconDelegate.f24842j;
        boolean z2 = !z;
        if (z != z2) {
            dropdownMenuEndIconDelegate.f24842j = z2;
            dropdownMenuEndIconDelegate.f24848p.cancel();
            dropdownMenuEndIconDelegate.f24847o.start();
        }
        if (!dropdownMenuEndIconDelegate.f24842j) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    @Override // p007c.p190n.p194b.p334e.p338c0.EndIconDelegate
    /* JADX INFO: renamed from: a */
    public void mo11043a() {
        float dimensionPixelOffset = this.f24865b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f24865b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f24865b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        MaterialShapeDrawable materialShapeDrawableM11054h = m11054h(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        MaterialShapeDrawable materialShapeDrawableM11054h2 = m11054h(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f24845m = materialShapeDrawableM11054h;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f24844l = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, materialShapeDrawableM11054h);
        this.f24844l.addState(new int[0], materialShapeDrawableM11054h2);
        this.f24864a.setEndIconDrawable(AppCompatResources.m14707b(this.f24865b, R.drawable.mtrl_dropdown_arrow));
        TextInputLayout textInputLayout = this.f24864a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.f24864a.setEndIconOnClickListener(new f());
        this.f24864a.m12856a(this.f24839g);
        this.f24864a.f29158k0.add(this.f24840h);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = AnimationUtils.f24793a;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(67);
        valueAnimatorOfFloat.addUpdateListener(new DropdownMenuEndIconDelegate2(this));
        this.f24848p = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(50);
        valueAnimatorOfFloat2.addUpdateListener(new DropdownMenuEndIconDelegate2(this));
        this.f24847o = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new DropdownMenuEndIconDelegate5(this));
        this.f24846n = (AccessibilityManager) this.f24865b.getSystemService("accessibility");
    }

    @Override // p007c.p190n.p194b.p334e.p338c0.EndIconDelegate
    /* JADX INFO: renamed from: b */
    public boolean mo11053b(int i) {
        return i != 0;
    }

    /* JADX INFO: renamed from: h */
    public final MaterialShapeDrawable m11054h(float f2, float f3, float f4, int i) {
        CornerSize cornerSize = ShapeAppearanceModel.f25618a;
        ShapeAppearanceModel.b bVar = new ShapeAppearanceModel.b();
        bVar.m11402f(f2);
        bVar.m11403g(f2);
        bVar.m11400d(f3);
        bVar.m11401e(f3);
        ShapeAppearanceModel shapeAppearanceModelM11398a = bVar.m11398a();
        Context context = this.f24865b;
        String str = MaterialShapeDrawable.f25569f;
        int iM11351c = MaterialAttributes.m11351c(context, R.attr.colorSurface, MaterialShapeDrawable.class.getSimpleName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.f25574h.f25595b = new ElevationOverlayProvider(context);
        materialShapeDrawable.m11365A();
        materialShapeDrawable.m11381q(ColorStateList.valueOf(iM11351c));
        MaterialShapeDrawable.b bVar2 = materialShapeDrawable.f25574h;
        if (bVar2.f25608o != f4) {
            bVar2.f25608o = f4;
            materialShapeDrawable.m11365A();
        }
        materialShapeDrawable.f25574h.f25594a = shapeAppearanceModelM11398a;
        materialShapeDrawable.invalidateSelf();
        MaterialShapeDrawable.b bVar3 = materialShapeDrawable.f25574h;
        if (bVar3.f25602i == null) {
            bVar3.f25602i = new Rect();
        }
        materialShapeDrawable.f25574h.f25602i.set(0, i, 0, i);
        materialShapeDrawable.invalidateSelf();
        return materialShapeDrawable;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m11055i() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f24843k;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }
}
