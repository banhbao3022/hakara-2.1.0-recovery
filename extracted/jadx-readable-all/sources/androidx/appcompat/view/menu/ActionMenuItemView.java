package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import p636z0.p644b.C7462a;
import p636z0.p644b.C7463b;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p651g.p652i.MenuItemImpl;
import p636z0.p644b.p651g.p652i.MenuView;
import p636z0.p644b.p651g.p652i.ShowableListMenu;
import p636z0.p644b.p653h.AppCompatTextView;
import p636z0.p644b.p653h.ForwardingListener;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements MenuView.a, View.OnClickListener, ActionMenuView.InterfaceC0061a {

    /* JADX INFO: renamed from: k */
    public MenuItemImpl f243k;

    /* JADX INFO: renamed from: l */
    public CharSequence f244l;

    /* JADX INFO: renamed from: m */
    public Drawable f245m;

    /* JADX INFO: renamed from: n */
    public MenuBuilder.b f246n;

    /* JADX INFO: renamed from: o */
    public ForwardingListener f247o;

    /* JADX INFO: renamed from: p */
    public AbstractC0054b f248p;

    /* JADX INFO: renamed from: q */
    public boolean f249q;

    /* JADX INFO: renamed from: r */
    public boolean f250r;

    /* JADX INFO: renamed from: s */
    public int f251s;

    /* JADX INFO: renamed from: t */
    public int f252t;

    /* JADX INFO: renamed from: u */
    public int f253u;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0053a extends ForwardingListener {
        public C0053a() {
            super(ActionMenuItemView.this);
        }

        @Override // p636z0.p644b.p653h.ForwardingListener
        /* JADX INFO: renamed from: b */
        public ShowableListMenu mo147b() {
            AbstractC0054b abstractC0054b = ActionMenuItemView.this.f248p;
            if (abstractC0054b != null) {
                return abstractC0054b.mo149a();
            }
            return null;
        }

        @Override // p636z0.p644b.p653h.ForwardingListener
        /* JADX INFO: renamed from: c */
        public boolean mo148c() {
            ShowableListMenu showableListMenuMo147b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            MenuBuilder.b bVar = actionMenuItemView.f246n;
            return bVar != null && bVar.mo150a(actionMenuItemView.f243k) && (showableListMenuMo147b = mo147b()) != null && showableListMenuMo147b.mo14749a();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC0054b {
        /* JADX INFO: renamed from: a */
        public abstract ShowableListMenu mo149a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0061a
    /* JADX INFO: renamed from: a */
    public boolean mo141a() {
        return m143c();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0061a
    /* JADX INFO: renamed from: b */
    public boolean mo142b() {
        return m143c() && this.f243k.getIcon() == null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m143c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p636z0.p644b.p651g.p652i.MenuView.a
    /* JADX INFO: renamed from: d */
    public void mo144d(MenuItemImpl menuItemImpl, int i) {
        this.f243k = menuItemImpl;
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitleCondensed());
        setId(menuItemImpl.f34850a);
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setEnabled(menuItemImpl.isEnabled());
        if (menuItemImpl.hasSubMenu() && this.f247o == null) {
            this.f247o = new C0053a();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m145e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* JADX INFO: renamed from: f */
    public final void m146f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f244l);
        if (this.f245m != null) {
            if (!((this.f243k.f34874y & 4) == 4) || (!this.f249q && !this.f250r)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f244l : null);
        CharSequence charSequence = this.f243k.f34866q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f243k.f34854e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f243k.f34867r;
        if (TextUtils.isEmpty(charSequence2)) {
            C7462a.m14578o(this, z3 ? null : this.f243k.f34854e);
        } else {
            C7462a.m14578o(this, charSequence2);
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuView.a
    public MenuItemImpl getItemData() {
        return this.f243k;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        MenuBuilder.b bVar = this.f246n;
        if (bVar != null) {
            bVar.mo150a(this.f243k);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f249q = m145e();
        m146f();
    }

    @Override // p636z0.p644b.p653h.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean zM143c = m143c();
        if (zM143c && (i3 = this.f252t) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f251s) : this.f251s;
        if (mode != 1073741824 && this.f251s > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zM143c || this.f245m == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f245m.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener;
        if (this.f243k.hasSubMenu() && (forwardingListener = this.f247o) != null && forwardingListener.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f250r != z) {
            this.f250r = z;
            MenuItemImpl menuItemImpl = this.f243k;
            if (menuItemImpl != null) {
                menuItemImpl.f34863n.m14782p();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f245m = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f253u;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m146f();
    }

    public void setItemInvoker(MenuBuilder.b bVar) {
        this.f246n = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f252t = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0054b abstractC0054b) {
        this.f248p = abstractC0054b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f244l = charSequence;
        m146f();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f249q = m145e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7463b.f34387c, i, 0);
        this.f251s = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f253u = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f252t = -1;
        setSaveEnabled(false);
    }
}
