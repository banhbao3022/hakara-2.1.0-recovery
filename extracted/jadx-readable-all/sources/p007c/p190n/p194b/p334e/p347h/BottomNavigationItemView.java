package p007c.p190n.p194b.p334e.p347h;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p334e.p342e.BadgeDrawable;
import p007c.p190n.p194b.p334e.p342e.BadgeUtils;
import p636z0.p644b.C7462a;
import p636z0.p644b.p651g.p652i.MenuItemImpl;
import p636z0.p644b.p651g.p652i.MenuView;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p725k.p739l.PointerIconCompat;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;

/* JADX INFO: renamed from: c.n.b.e.h.a, reason: use source file name */
/* JADX INFO: compiled from: BottomNavigationItemView.java */
/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationItemView extends FrameLayout implements MenuView.a {

    /* JADX INFO: renamed from: f */
    public static final int[] f25002f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g */
    public final int f25003g;

    /* JADX INFO: renamed from: h */
    public float f25004h;

    /* JADX INFO: renamed from: i */
    public float f25005i;

    /* JADX INFO: renamed from: j */
    public float f25006j;

    /* JADX INFO: renamed from: k */
    public int f25007k;

    /* JADX INFO: renamed from: l */
    public boolean f25008l;

    /* JADX INFO: renamed from: m */
    public ImageView f25009m;

    /* JADX INFO: renamed from: n */
    public final ViewGroup f25010n;

    /* JADX INFO: renamed from: o */
    public final TextView f25011o;

    /* JADX INFO: renamed from: p */
    public final TextView f25012p;

    /* JADX INFO: renamed from: q */
    public int f25013q;

    /* JADX INFO: renamed from: r */
    public MenuItemImpl f25014r;

    /* JADX INFO: renamed from: s */
    public ColorStateList f25015s;

    /* JADX INFO: renamed from: t */
    public Drawable f25016t;

    /* JADX INFO: renamed from: u */
    public Drawable f25017u;

    /* JADX INFO: renamed from: v */
    public BadgeDrawable f25018v;

    /* JADX INFO: renamed from: c.n.b.e.h.a$a */
    /* JADX INFO: compiled from: BottomNavigationItemView.java */
    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (BottomNavigationItemView.this.f25009m.getVisibility() == 0) {
                BottomNavigationItemView bottomNavigationItemView = BottomNavigationItemView.this;
                ImageView imageView = bottomNavigationItemView.f25009m;
                if (bottomNavigationItemView.m11116b()) {
                    BadgeUtils.m11106c(bottomNavigationItemView.f25018v, imageView, null);
                }
            }
        }
    }

    public BottomNavigationItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m11112c(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public static void m11113e(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* JADX INFO: renamed from: f */
    public static void m11114f(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof BottomNavigationItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public final void m11115a(float f, float f2) {
        this.f25004h = f - f2;
        this.f25005i = (f2 * 1.0f) / f;
        this.f25006j = (f * 1.0f) / f2;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11116b() {
        return this.f25018v != null;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuView.a
    /* JADX INFO: renamed from: d */
    public void mo144d(MenuItemImpl menuItemImpl, int i) {
        this.f25014r = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.f34854e);
        setId(menuItemImpl.f34850a);
        if (!TextUtils.isEmpty(menuItemImpl.f34866q)) {
            setContentDescription(menuItemImpl.f34866q);
        }
        C7462a.m14578o(this, !TextUtils.isEmpty(menuItemImpl.f34867r) ? menuItemImpl.f34867r : menuItemImpl.f34854e);
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
    }

    public BadgeDrawable getBadge() {
        return this.f25018v;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuView.a
    public MenuItemImpl getItemData() {
        return this.f25014r;
    }

    public int getItemPosition() {
        return this.f25013q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.f25014r;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.f25014r.isChecked()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f25002f);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f25018v;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            MenuItemImpl menuItemImpl = this.f25014r;
            CharSequence charSequence = menuItemImpl.f34854e;
            if (!TextUtils.isEmpty(menuItemImpl.f34866q)) {
                charSequence = this.f25014r.f34866q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f25018v.m11093c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) AccessibilityNodeInfoCompat.c.m16278a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).f38034a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) AccessibilityNodeInfoCompat.a.f38021a.f38029i);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(mtp.media.karaoke.R.string.item_view_role_description));
    }

    public void setBadge(BadgeDrawable badgeDrawable) {
        this.f25018v = badgeDrawable;
        ImageView imageView = this.f25009m;
        if (imageView == null || !m11116b() || imageView == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        BadgeUtils.m11104a(this.f25018v, imageView, null);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.f25012p;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.f25012p;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.f25011o;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.f25011o;
        textView4.setPivotY(textView4.getBaseline());
        int i = this.f25007k;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    m11112c(this.f25009m, this.f25003g, 49);
                    ViewGroup viewGroup = this.f25010n;
                    m11114f(viewGroup, ((Integer) viewGroup.getTag(mtp.media.karaoke.R.id.mtrl_view_tag_bottom_padding)).intValue());
                    this.f25012p.setVisibility(0);
                } else {
                    m11112c(this.f25009m, this.f25003g, 17);
                    m11114f(this.f25010n, 0);
                    this.f25012p.setVisibility(4);
                }
                this.f25011o.setVisibility(4);
            } else if (i == 1) {
                ViewGroup viewGroup2 = this.f25010n;
                m11114f(viewGroup2, ((Integer) viewGroup2.getTag(mtp.media.karaoke.R.id.mtrl_view_tag_bottom_padding)).intValue());
                if (z) {
                    m11112c(this.f25009m, (int) (this.f25003g + this.f25004h), 49);
                    m11113e(this.f25012p, 1.0f, 1.0f, 0);
                    TextView textView5 = this.f25011o;
                    float f = this.f25005i;
                    m11113e(textView5, f, f, 4);
                } else {
                    m11112c(this.f25009m, this.f25003g, 49);
                    TextView textView6 = this.f25012p;
                    float f2 = this.f25006j;
                    m11113e(textView6, f2, f2, 4);
                    m11113e(this.f25011o, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                m11112c(this.f25009m, this.f25003g, 17);
                this.f25012p.setVisibility(8);
                this.f25011o.setVisibility(8);
            }
        } else if (this.f25008l) {
            if (z) {
                m11112c(this.f25009m, this.f25003g, 49);
                ViewGroup viewGroup3 = this.f25010n;
                m11114f(viewGroup3, ((Integer) viewGroup3.getTag(mtp.media.karaoke.R.id.mtrl_view_tag_bottom_padding)).intValue());
                this.f25012p.setVisibility(0);
            } else {
                m11112c(this.f25009m, this.f25003g, 17);
                m11114f(this.f25010n, 0);
                this.f25012p.setVisibility(4);
            }
            this.f25011o.setVisibility(4);
        } else {
            ViewGroup viewGroup4 = this.f25010n;
            m11114f(viewGroup4, ((Integer) viewGroup4.getTag(mtp.media.karaoke.R.id.mtrl_view_tag_bottom_padding)).intValue());
            if (z) {
                m11112c(this.f25009m, (int) (this.f25003g + this.f25004h), 49);
                m11113e(this.f25012p, 1.0f, 1.0f, 0);
                TextView textView7 = this.f25011o;
                float f3 = this.f25005i;
                m11113e(textView7, f3, f3, 4);
            } else {
                m11112c(this.f25009m, this.f25003g, 49);
                TextView textView8 = this.f25012p;
                float f4 = this.f25006j;
                m11113e(textView8, f4, f4, 4);
                m11113e(this.f25011o, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f25011o.setEnabled(z);
        this.f25012p.setEnabled(z);
        this.f25009m.setEnabled(z);
        if (z) {
            ViewCompat.m16328v(this, PointerIconCompat.m16306a(getContext(), CloseCodes.PROTOCOL_ERROR));
        } else {
            ViewCompat.m16328v(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f25016t) {
            return;
        }
        this.f25016t = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C8162a.m16054Y(drawable).mutate();
            this.f25017u = drawable;
            ColorStateList colorStateList = this.f25015s;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f25009m.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25009m.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f25009m.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f25015s = colorStateList;
        if (this.f25014r == null || (drawable = this.f25017u) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f25017u.invalidateSelf();
    }

    public void setItemBackground(int i) {
        Drawable drawableM16141b;
        if (i == 0) {
            drawableM16141b = null;
        } else {
            Context context = getContext();
            Object obj = ContextCompat.f37815a;
            drawableM16141b = ContextCompat.c.m16141b(context, i);
        }
        setItemBackground(drawableM16141b);
    }

    public void setItemPosition(int i) {
        this.f25013q = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f25007k != i) {
            this.f25007k = i;
            MenuItemImpl menuItemImpl = this.f25014r;
            if (menuItemImpl != null) {
                setChecked(menuItemImpl.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f25008l != z) {
            this.f25008l = z;
            MenuItemImpl menuItemImpl = this.f25014r;
            if (menuItemImpl != null) {
                setChecked(menuItemImpl.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        C8162a.m16047R(this.f25012p, i);
        m11115a(this.f25011o.getTextSize(), this.f25012p.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        C8162a.m16047R(this.f25011o, i);
        m11115a(this.f25011o.getTextSize(), this.f25012p.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f25011o.setTextColor(colorStateList);
            this.f25012p.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f25011o.setText(charSequence);
        this.f25012p.setText(charSequence);
        MenuItemImpl menuItemImpl = this.f25014r;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.f34866q)) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.f25014r;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.f34867r)) {
            charSequence = this.f25014r.f34867r;
        }
        C7462a.m14578o(this, charSequence);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25013q = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(mtp.media.karaoke.R.layout.design_bottom_navigation_item, (ViewGroup) this, true);
        setBackgroundResource(mtp.media.karaoke.R.drawable.design_bottom_navigation_item_background);
        this.f25003g = resources.getDimensionPixelSize(mtp.media.karaoke.R.dimen.design_bottom_navigation_margin);
        this.f25009m = (ImageView) findViewById(mtp.media.karaoke.R.id.icon);
        ViewGroup viewGroup = (ViewGroup) findViewById(mtp.media.karaoke.R.id.labelGroup);
        this.f25010n = viewGroup;
        TextView textView = (TextView) findViewById(mtp.media.karaoke.R.id.smallLabel);
        this.f25011o = textView;
        TextView textView2 = (TextView) findViewById(mtp.media.karaoke.R.id.largeLabel);
        this.f25012p = textView2;
        viewGroup.setTag(mtp.media.karaoke.R.id.mtrl_view_tag_bottom_padding, Integer.valueOf(viewGroup.getPaddingBottom()));
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        m11115a(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.f25009m;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        setBackground(drawable);
    }
}
