package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.stetho.websocket.CloseCodes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p337c.MotionSpec;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p352m.Chip2;
import p007c.p190n.p194b.p334e.p352m.ChipDrawable;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p007c.p190n.p194b.p334e.p362v.TextAppearance;
import p007c.p190n.p194b.p334e.p362v.TextAppearanceFontCallback;
import p007c.p190n.p194b.p334e.p363w.RippleUtils;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;
import p007c.p190n.p194b.p334e.p365y.Shapeable;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p644b.p653h.AppCompatCheckBox;
import p636z0.p725k.p729e.p730l.WrappedDrawable;
import p636z0.p725k.p737j.BidiFormatter;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;
import p636z0.p745m.p747b.ExploreByTouchHelper;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements ChipDrawable.a, Shapeable {

    /* JADX INFO: renamed from: i */
    public static final Rect f28912i = new Rect();

    /* JADX INFO: renamed from: j */
    public static final int[] f28913j = {R.attr.state_selected};

    /* JADX INFO: renamed from: k */
    public static final int[] f28914k = {R.attr.state_checkable};

    /* JADX INFO: renamed from: A */
    public final TextAppearanceFontCallback f28915A;

    /* JADX INFO: renamed from: l */
    public ChipDrawable f28916l;

    /* JADX INFO: renamed from: m */
    public InsetDrawable f28917m;

    /* JADX INFO: renamed from: n */
    public RippleDrawable f28918n;

    /* JADX INFO: renamed from: o */
    public View.OnClickListener f28919o;

    /* JADX INFO: renamed from: p */
    public CompoundButton.OnCheckedChangeListener f28920p;

    /* JADX INFO: renamed from: q */
    public boolean f28921q;

    /* JADX INFO: renamed from: r */
    public boolean f28922r;

    /* JADX INFO: renamed from: s */
    public boolean f28923s;

    /* JADX INFO: renamed from: t */
    public boolean f28924t;

    /* JADX INFO: renamed from: u */
    public boolean f28925u;

    /* JADX INFO: renamed from: v */
    public int f28926v;

    /* JADX INFO: renamed from: w */
    public int f28927w;

    /* JADX INFO: renamed from: x */
    public final C5939b f28928x;

    /* JADX INFO: renamed from: y */
    public final Rect f28929y;

    /* JADX INFO: renamed from: z */
    public final RectF f28930z;

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$a */
    public class C5938a extends TextAppearanceFontCallback {
        public C5938a() {
        }

        @Override // p007c.p190n.p194b.p334e.p362v.TextAppearanceFontCallback
        /* JADX INFO: renamed from: a */
        public void mo11338a(int i) {
        }

        @Override // p007c.p190n.p194b.p334e.p362v.TextAppearanceFontCallback
        /* JADX INFO: renamed from: b */
        public void mo11339b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            ChipDrawable chipDrawable = chip.f28916l;
            chip.setText(chipDrawable.f25140L0 ? chipDrawable.f25141M : chip.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.Chip$b */
    public class C5939b extends ExploreByTouchHelper {
        public C5939b(Chip chip) {
            super(chip);
        }

        @Override // p636z0.p745m.p747b.ExploreByTouchHelper
        /* JADX INFO: renamed from: m */
        public void mo12778m(List<Integer> list) {
            boolean z = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.f28912i;
            if (chip.m12771e()) {
                Chip chip2 = Chip.this;
                ChipDrawable chipDrawable = chip2.f28916l;
                if (chipDrawable != null && chipDrawable.f25149S) {
                    z = true;
                }
                if (!z || chip2.f28919o == null) {
                    return;
                }
                list.add(1);
            }
        }

        @Override // p636z0.p745m.p747b.ExploreByTouchHelper
        /* JADX INFO: renamed from: p */
        public boolean mo12779p(int i, int i2, Bundle bundle) {
            boolean z = false;
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    Chip chip = Chip.this;
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.f28919o;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    chip.f28928x.m16371u(1, 1);
                }
            }
            return z;
        }

        @Override // p636z0.p745m.p747b.ExploreByTouchHelper
        /* JADX INFO: renamed from: q */
        public void mo12780q(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.f38018b.setCheckable(Chip.this.m12772f());
            accessibilityNodeInfoCompat.f38018b.setClickable(Chip.this.isClickable());
            if (Chip.this.m12772f() || Chip.this.isClickable()) {
                accessibilityNodeInfoCompat.f38018b.setClassName(Chip.this.m12772f() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                accessibilityNodeInfoCompat.f38018b.setClassName("android.view.View");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityNodeInfoCompat.f38018b.setText(text);
            } else {
                accessibilityNodeInfoCompat.f38018b.setContentDescription(text);
            }
        }

        @Override // p636z0.p745m.p747b.ExploreByTouchHelper
        /* JADX INFO: renamed from: r */
        public void mo12781r(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (i != 1) {
                accessibilityNodeInfoCompat.f38018b.setContentDescription("");
                accessibilityNodeInfoCompat.f38018b.setBoundsInParent(Chip.f28912i);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfoCompat.f38018b.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                accessibilityNodeInfoCompat.f38018b.setContentDescription(context.getString(mtp.media.karaoke.R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            }
            accessibilityNodeInfoCompat.f38018b.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
            accessibilityNodeInfoCompat.m16260a(AccessibilityNodeInfoCompat.a.f38021a);
            accessibilityNodeInfoCompat.f38018b.setEnabled(Chip.this.isEnabled());
        }

        @Override // p636z0.p745m.p747b.ExploreByTouchHelper
        /* JADX INFO: renamed from: s */
        public void mo12782s(int i, boolean z) {
            if (i == 1) {
                Chip chip = Chip.this;
                chip.f28924t = z;
                chip.refreshDrawableState();
            }
        }

        /* JADX INFO: renamed from: w */
        public int m12783w(float f, float f2) {
            Chip chip = Chip.this;
            Rect rect = Chip.f28912i;
            return (chip.m12771e() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f28930z.setEmpty();
        if (m12771e() && this.f28919o != null) {
            ChipDrawable chipDrawable = this.f28916l;
            chipDrawable.m11158F(chipDrawable.getBounds(), this.f28930z);
        }
        return this.f28930z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f28929y.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f28929y;
    }

    private TextAppearance getTextAppearance() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25175s0.f25503f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f28923s != z) {
            this.f28923s = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f28922r != z) {
            this.f28922r = z;
            refreshDrawableState();
        }
    }

    @Override // p007c.p190n.p194b.p334e.p352m.ChipDrawable.a
    /* JADX INFO: renamed from: a */
    public void mo11198a() {
        m12770d(this.f28927w);
        requestLayout();
        invalidateOutline();
    }

    /* JADX INFO: renamed from: d */
    public boolean m12770d(int i) {
        this.f28927w = i;
        if (!this.f28925u) {
            if (this.f28917m != null) {
                m12773g();
            } else {
                int[] iArr = RippleUtils.f25542a;
                m12775i();
            }
            return false;
        }
        int iMax = Math.max(0, i - ((int) this.f28916l.f25131H));
        int iMax2 = Math.max(0, i - this.f28916l.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f28917m != null) {
                m12773g();
            } else {
                int[] iArr2 = RippleUtils.f25542a;
                m12775i();
            }
            return false;
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f28917m != null) {
            Rect rect = new Rect();
            this.f28917m.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr3 = RippleUtils.f25542a;
                m12775i();
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f28917m = new InsetDrawable((Drawable) this.f28916l, i2, i3, i2, i3);
        int[] iArr4 = RippleUtils.f25542a;
        m12775i();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = ExploreByTouchHelper.class.getDeclaredField("p");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f28928x)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = ExploreByTouchHelper.class.getDeclaredMethod("v", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f28928x, Integer.MIN_VALUE);
                    z = true;
                } else {
                    z = false;
                }
            } catch (IllegalAccessException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            } catch (NoSuchFieldException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (NoSuchMethodException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (InvocationTargetException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            }
        } else {
            z = false;
        }
        if (!z) {
            C5939b c5939b = this.f28928x;
            if (c5939b.f38158k.isEnabled() && c5939b.f38158k.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    int iM12783w = c5939b.m12783w(motionEvent.getX(), motionEvent.getY());
                    int i2 = c5939b.f38163p;
                    if (i2 != iM12783w) {
                        c5939b.f38163p = iM12783w;
                        c5939b.m16371u(iM12783w, 128);
                        c5939b.m16371u(i2, 256);
                    }
                    if (iM12783w != Integer.MIN_VALUE) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else if (action == 10 && (i = c5939b.f38163p) != Integer.MIN_VALUE) {
                    if (i != Integer.MIN_VALUE) {
                        c5939b.f38163p = Integer.MIN_VALUE;
                        c5939b.m16371u(Integer.MIN_VALUE, 128);
                        c5939b.m16371u(i, 256);
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (!z2 && !super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        C5939b c5939b = this.f28928x;
        Objects.requireNonNull(c5939b);
        boolean zM16368n = false;
        int i2 = 0;
        zM16368n = false;
        zM16368n = false;
        zM16368n = false;
        zM16368n = false;
        zM16368n = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && c5939b.m16368n(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zM16368n = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = c5939b.f38162o;
                                if (i != Integer.MIN_VALUE) {
                                    c5939b.mo12779p(i, 16, null);
                                }
                                zM16368n = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = c5939b.f38162o;
                    if (i != Integer.MIN_VALUE) {
                        c5939b.mo12779p(i, 16, null);
                    }
                    zM16368n = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM16368n = c5939b.m16368n(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM16368n = c5939b.m16368n(1, null);
            }
        }
        if (!zM16368n || this.f28928x.f38162o == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p636z0.p644b.p653h.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        ChipDrawable chipDrawable = this.f28916l;
        boolean zM11184h0 = false;
        int i2 = 0;
        zM11184h0 = false;
        if (chipDrawable != null && ChipDrawable.m11153L(chipDrawable.f25150T)) {
            ChipDrawable chipDrawable2 = this.f28916l;
            ?? IsEnabled = isEnabled();
            if (this.f28924t) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.f28923s) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.f28922r) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.f28924t) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f28923s) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f28922r) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            zM11184h0 = chipDrawable2.m11184h0(iArr);
        }
        if (zM11184h0) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12771e() {
        ChipDrawable chipDrawable = this.f28916l;
        return (chipDrawable == null || chipDrawable.m11161I() == null) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public boolean m12772f() {
        ChipDrawable chipDrawable = this.f28916l;
        return chipDrawable != null && chipDrawable.f25155Y;
    }

    /* JADX INFO: renamed from: g */
    public final void m12773g() {
        if (this.f28917m != null) {
            this.f28917m = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            int[] iArr = RippleUtils.f25542a;
            m12775i();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f28917m;
        return insetDrawable == null ? this.f28916l : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25157a0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25158b0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25129G;
        }
        return null;
    }

    public float getChipCornerRadius() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return Math.max(0.0f, chipDrawable.m11160H());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f28916l;
    }

    public float getChipEndPadding() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25168l0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable == null || (drawable = chipDrawable.f25145O) == 0) {
            return null;
        }
        return drawable instanceof WrappedDrawable ? ((WrappedDrawable) drawable).mo16197b() : drawable;
    }

    public float getChipIconSize() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25147Q;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25146P;
        }
        return null;
    }

    public float getChipMinHeight() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25131H;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25161e0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25135J;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25137K;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.m11161I();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25154X;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25167k0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25153W;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25166j0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25152V;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25138K0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        C5939b c5939b = this.f28928x;
        if (c5939b.f38162o == 1 || c5939b.f38161n == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public MotionSpec getHideMotionSpec() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25160d0;
        }
        return null;
    }

    public float getIconEndPadding() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25163g0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25162f0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25139L;
        }
        return null;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f28916l.f25574h.f25594a;
    }

    public MotionSpec getShowMotionSpec() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25159c0;
        }
        return null;
    }

    public float getTextEndPadding() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25165i0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            return chipDrawable.f25164h0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public final void m12774h() {
        if (m12771e()) {
            ChipDrawable chipDrawable = this.f28916l;
            if ((chipDrawable != null && chipDrawable.f25149S) && this.f28919o != null) {
                ViewCompat.m16327u(this, this.f28928x);
                return;
            }
        }
        ViewCompat.m16327u(this, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m12775i() {
        this.f28918n = new RippleDrawable(RippleUtils.m11360c(this.f28916l.f25139L), getBackgroundDrawable(), null);
        this.f28916l.m11193q0(false);
        RippleDrawable rippleDrawable = this.f28918n;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        setBackground(rippleDrawable);
        m12776j();
    }

    /* JADX INFO: renamed from: j */
    public final void m12776j() {
        ChipDrawable chipDrawable;
        if (TextUtils.isEmpty(getText()) || (chipDrawable = this.f28916l) == null) {
            return;
        }
        int iM11159G = (int) (chipDrawable.m11159G() + chipDrawable.f25168l0 + chipDrawable.f25165i0);
        ChipDrawable chipDrawable2 = this.f28916l;
        int iM11156D = (int) (chipDrawable2.m11156D() + chipDrawable2.f25161e0 + chipDrawable2.f25164h0);
        if (this.f28917m != null) {
            Rect rect = new Rect();
            this.f28917m.getPadding(rect);
            iM11156D += rect.left;
            iM11159G += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        setPaddingRelative(iM11156D, paddingTop, iM11159G, paddingBottom);
    }

    /* JADX INFO: renamed from: k */
    public final void m12777k() {
        TextPaint paint = getPaint();
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            paint.drawableState = chipDrawable.getState();
        }
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m11354c(getContext(), paint, this.f28915A);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4799a.m11005o0(this, this.f28916l);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, f28913j);
        }
        if (m12772f()) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, f28914k);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C5939b c5939b = this.f28928x;
        int i2 = c5939b.f38162o;
        if (i2 != Integer.MIN_VALUE) {
            c5939b.m16366k(i2);
        }
        if (z) {
            c5939b.m16368n(i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (m12772f() || isClickable()) {
            accessibilityNodeInfo.setClassName(m12772f() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(m12772f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f25471h) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i2) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i2)) == this) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(mtp.media.karaoke.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) AccessibilityNodeInfoCompat.c.m16278a(!(tag instanceof Integer) ? -1 : ((Integer) tag).intValue(), 1, i, 1, false, isChecked()).f38034a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), CloseCodes.PROTOCOL_ERROR);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f28926v != i) {
            this.f28926v = i;
            m12776j();
        }
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f28922r) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.f28922r) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f28919o;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    this.f28928x.m16371u(1, 1);
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f28918n) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p636z0.p644b.p653h.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f28918n) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p636z0.p644b.p653h.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11165O(z);
        }
    }

    public void setCheckableResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11165O(chipDrawable.f25169m0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable == null) {
            this.f28921q = z;
            return;
        }
        if (chipDrawable.f25155Y) {
            boolean zIsChecked = isChecked();
            super.setChecked(z);
            if (zIsChecked == z || (onCheckedChangeListener = this.f28920p) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11166P(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11166P(AppCompatResources.m14707b(chipDrawable.f25169m0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11167Q(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11167Q(AppCompatResources.m14706a(chipDrawable.f25169m0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11168R(chipDrawable.f25169m0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable == null || chipDrawable.f25129G == colorStateList) {
            return;
        }
        chipDrawable.f25129G = colorStateList;
        chipDrawable.onStateChange(chipDrawable.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11169S(AppCompatResources.m14706a(chipDrawable.f25169m0, i));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11170T(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11170T(chipDrawable.f25169m0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(ChipDrawable chipDrawable) {
        ChipDrawable chipDrawable2 = this.f28916l;
        if (chipDrawable2 != chipDrawable) {
            if (chipDrawable2 != null) {
                chipDrawable2.f25136J0 = new WeakReference<>(null);
            }
            this.f28916l = chipDrawable;
            chipDrawable.f25140L0 = false;
            Objects.requireNonNull(chipDrawable);
            chipDrawable.f25136J0 = new WeakReference<>(this);
            m12770d(this.f28927w);
        }
    }

    public void setChipEndPadding(float f) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable == null || chipDrawable.f25168l0 == f) {
            return;
        }
        chipDrawable.f25168l0 = f;
        chipDrawable.invalidateSelf();
        chipDrawable.m11163M();
    }

    public void setChipEndPaddingResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11171U(chipDrawable.f25169m0.getResources().getDimension(i));
        }
    }

    public void setChipIcon(Drawable drawable) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11172V(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11172V(AppCompatResources.m14707b(chipDrawable.f25169m0, i));
        }
    }

    public void setChipIconSize(float f) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11173W(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11173W(chipDrawable.f25169m0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11174X(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11174X(AppCompatResources.m14706a(chipDrawable.f25169m0, i));
        }
    }

    public void setChipIconVisible(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11175Y(chipDrawable.f25169m0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable == null || chipDrawable.f25131H == f) {
            return;
        }
        chipDrawable.f25131H = f;
        chipDrawable.invalidateSelf();
        chipDrawable.m11163M();
    }

    public void setChipMinHeightResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11176Z(chipDrawable.f25169m0.getResources().getDimension(i));
        }
    }

    public void setChipStartPadding(float f) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable == null || chipDrawable.f25161e0 == f) {
            return;
        }
        chipDrawable.f25161e0 = f;
        chipDrawable.invalidateSelf();
        chipDrawable.m11163M();
    }

    public void setChipStartPaddingResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11177a0(chipDrawable.f25169m0.getResources().getDimension(i));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11178b0(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11178b0(AppCompatResources.m14706a(chipDrawable.f25169m0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11179c0(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11179c0(chipDrawable.f25169m0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11180d0(drawable);
        }
        m12774h();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable == null || chipDrawable.f25154X == charSequence) {
            return;
        }
        BidiFormatter bidiFormatterM16209c = BidiFormatter.m16209c();
        chipDrawable.f25154X = bidiFormatterM16209c.m16211e(charSequence, bidiFormatterM16209c.f37946h, true);
        chipDrawable.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11181e0(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11181e0(chipDrawable.f25169m0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11180d0(AppCompatResources.m14707b(chipDrawable.f25169m0, i));
        }
        m12774h();
    }

    public void setCloseIconSize(float f) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11182f0(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11182f0(chipDrawable.f25169m0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11183g0(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11183g0(chipDrawable.f25169m0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11185i0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11185i0(AppCompatResources.m14706a(chipDrawable.f25169m0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            MaterialShapeDrawable.b bVar = chipDrawable.f25574h;
            if (bVar.f25608o != f) {
                bVar.f25608o = f;
                chipDrawable.m11365A();
            }
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f28916l == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.f25138K0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f28925u = z;
        m12770d(this.f28927w);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.f25160d0 = motionSpec;
        }
    }

    public void setHideMotionSpecResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.f25160d0 = MotionSpec.m11035b(chipDrawable.f25169m0, i);
        }
    }

    public void setIconEndPadding(float f) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11187k0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11187k0(chipDrawable.f25169m0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11188l0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11188l0(chipDrawable.f25169m0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f28916l == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.f25142M0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f28920p = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f28919o = onClickListener;
        m12774h();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11189m0(colorStateList);
        }
        if (this.f28916l.f25132H0) {
            return;
        }
        m12775i();
    }

    public void setRippleColorResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11189m0(AppCompatResources.m14706a(chipDrawable.f25169m0, i));
            if (this.f28916l.f25132H0) {
                return;
            }
            m12775i();
        }
    }

    @Override // p007c.p190n.p194b.p334e.p365y.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        ChipDrawable chipDrawable = this.f28916l;
        chipDrawable.f25574h.f25594a = shapeAppearanceModel;
        chipDrawable.invalidateSelf();
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.f25159c0 = motionSpec;
        }
    }

    public void setShowMotionSpecResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.f25159c0 = MotionSpec.m11035b(chipDrawable.f25169m0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(chipDrawable.f25140L0 ? null : charSequence, bufferType);
        ChipDrawable chipDrawable2 = this.f28916l;
        if (chipDrawable2 != null) {
            chipDrawable2.m11190n0(charSequence);
        }
    }

    public void setTextAppearance(TextAppearance textAppearance) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.f25175s0.m11337b(textAppearance, chipDrawable.f25169m0);
        }
        m12777k();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable == null || chipDrawable.f25165i0 == f) {
            return;
        }
        chipDrawable.f25165i0 = f;
        chipDrawable.invalidateSelf();
        chipDrawable.m11163M();
    }

    public void setTextEndPaddingResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11191o0(chipDrawable.f25169m0.getResources().getDimension(i));
        }
    }

    public void setTextStartPadding(float f) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable == null || chipDrawable.f25164h0 == f) {
            return;
        }
        chipDrawable.f25164h0 = f;
        chipDrawable.invalidateSelf();
        chipDrawable.m11163M();
    }

    public void setTextStartPaddingResource(int i) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11192p0(chipDrawable.f25169m0.getResources().getDimension(i));
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, mtp.media.karaoke.R.attr.chipStyle);
    }

    public void setCloseIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11186j0(z);
        }
        m12774h();
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(MaterialThemeOverlay.m11090a(context, attributeSet, i, 2132017890), attributeSet, i);
        this.f28929y = new Rect();
        this.f28930z = new RectF();
        this.f28915A = new C5938a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        ChipDrawable chipDrawable = new ChipDrawable(context2, attributeSet, i, 2132017890);
        Context context3 = chipDrawable.f25169m0;
        int[] iArr = C4801b.f24753h;
        TypedArray typedArrayM11347d = ThemeEnforcement.m11347d(context3, attributeSet, iArr, i, 2132017890, new int[0]);
        chipDrawable.f25144N0 = typedArrayM11347d.hasValue(37);
        ColorStateList colorStateListM10961L = C4799a.m10961L(chipDrawable.f25169m0, typedArrayM11347d, 24);
        if (chipDrawable.f25127F != colorStateListM10961L) {
            chipDrawable.f25127F = colorStateListM10961L;
            chipDrawable.onStateChange(chipDrawable.getState());
        }
        chipDrawable.m11169S(C4799a.m10961L(chipDrawable.f25169m0, typedArrayM11347d, 11));
        chipDrawable.m11176Z(typedArrayM11347d.getDimension(19, 0.0f));
        if (typedArrayM11347d.hasValue(12)) {
            chipDrawable.m11170T(typedArrayM11347d.getDimension(12, 0.0f));
        }
        chipDrawable.m11178b0(C4799a.m10961L(chipDrawable.f25169m0, typedArrayM11347d, 22));
        chipDrawable.m11179c0(typedArrayM11347d.getDimension(23, 0.0f));
        chipDrawable.m11189m0(C4799a.m10961L(chipDrawable.f25169m0, typedArrayM11347d, 36));
        chipDrawable.m11190n0(typedArrayM11347d.getText(5));
        TextAppearance textAppearance = (!typedArrayM11347d.hasValue(0) || (resourceId = typedArrayM11347d.getResourceId(0, 0)) == 0) ? null : new TextAppearance(chipDrawable.f25169m0, resourceId);
        textAppearance.f25533k = typedArrayM11347d.getDimension(1, textAppearance.f25533k);
        chipDrawable.f25175s0.m11337b(textAppearance, chipDrawable.f25169m0);
        int i2 = typedArrayM11347d.getInt(3, 0);
        if (i2 == 1) {
            chipDrawable.f25138K0 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            chipDrawable.f25138K0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            chipDrawable.f25138K0 = TextUtils.TruncateAt.END;
        }
        chipDrawable.m11175Y(typedArrayM11347d.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            chipDrawable.m11175Y(typedArrayM11347d.getBoolean(15, false));
        }
        chipDrawable.m11172V(C4799a.m10963N(chipDrawable.f25169m0, typedArrayM11347d, 14));
        if (typedArrayM11347d.hasValue(17)) {
            chipDrawable.m11174X(C4799a.m10961L(chipDrawable.f25169m0, typedArrayM11347d, 17));
        }
        chipDrawable.m11173W(typedArrayM11347d.getDimension(16, -1.0f));
        chipDrawable.m11186j0(typedArrayM11347d.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            chipDrawable.m11186j0(typedArrayM11347d.getBoolean(26, false));
        }
        chipDrawable.m11180d0(C4799a.m10963N(chipDrawable.f25169m0, typedArrayM11347d, 25));
        chipDrawable.m11185i0(C4799a.m10961L(chipDrawable.f25169m0, typedArrayM11347d, 30));
        chipDrawable.m11182f0(typedArrayM11347d.getDimension(28, 0.0f));
        chipDrawable.m11165O(typedArrayM11347d.getBoolean(6, false));
        chipDrawable.m11168R(typedArrayM11347d.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            chipDrawable.m11168R(typedArrayM11347d.getBoolean(8, false));
        }
        chipDrawable.m11166P(C4799a.m10963N(chipDrawable.f25169m0, typedArrayM11347d, 7));
        if (typedArrayM11347d.hasValue(9)) {
            chipDrawable.m11167Q(C4799a.m10961L(chipDrawable.f25169m0, typedArrayM11347d, 9));
        }
        chipDrawable.f25159c0 = MotionSpec.m11034a(chipDrawable.f25169m0, typedArrayM11347d, 39);
        chipDrawable.f25160d0 = MotionSpec.m11034a(chipDrawable.f25169m0, typedArrayM11347d, 33);
        chipDrawable.m11177a0(typedArrayM11347d.getDimension(21, 0.0f));
        chipDrawable.m11188l0(typedArrayM11347d.getDimension(35, 0.0f));
        chipDrawable.m11187k0(typedArrayM11347d.getDimension(34, 0.0f));
        chipDrawable.m11192p0(typedArrayM11347d.getDimension(41, 0.0f));
        chipDrawable.m11191o0(typedArrayM11347d.getDimension(40, 0.0f));
        chipDrawable.m11183g0(typedArrayM11347d.getDimension(29, 0.0f));
        chipDrawable.m11181e0(typedArrayM11347d.getDimension(27, 0.0f));
        chipDrawable.m11171U(typedArrayM11347d.getDimension(13, 0.0f));
        chipDrawable.f25142M0 = typedArrayM11347d.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM11347d.recycle();
        ThemeEnforcement.m11344a(context2, attributeSet, i, 2132017890);
        ThemeEnforcement.m11345b(context2, attributeSet, iArr, i, 2132017890, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, 2132017890);
        this.f28925u = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f28927w = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(C4799a.m11020z(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(chipDrawable);
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        chipDrawable.m11380p(getElevation());
        ThemeEnforcement.m11344a(context2, attributeSet, i, 2132017890);
        ThemeEnforcement.m11345b(context2, attributeSet, iArr, i, 2132017890, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, i, 2132017890);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(C4799a.m10961L(context2, typedArrayObtainStyledAttributes2, 2));
        }
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f28928x = new C5939b(this);
        m12774h();
        if (!zHasValue) {
            setOutlineProvider(new Chip2(this));
        }
        setChecked(this.f28921q);
        setText(chipDrawable.f25141M);
        setEllipsize(chipDrawable.f25138K0);
        m12777k();
        if (!this.f28916l.f25140L0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m12776j();
        if (this.f28925u) {
            setMinHeight(this.f28927w);
        }
        this.f28926v = getLayoutDirection();
    }

    public void setCheckedIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11168R(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.m11175Y(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.f25175s0.m11337b(new TextAppearance(chipDrawable.f25169m0, i), chipDrawable.f25169m0);
        }
        m12777k();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        ChipDrawable chipDrawable = this.f28916l;
        if (chipDrawable != null) {
            chipDrawable.f25175s0.m11337b(new TextAppearance(chipDrawable.f25169m0, i), chipDrawable.f25169m0);
        }
        m12777k();
    }
}
