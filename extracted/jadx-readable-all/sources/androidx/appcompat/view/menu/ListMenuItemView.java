package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p636z0.p644b.C7463b;
import p636z0.p644b.p651g.p652i.MenuItemImpl;
import p636z0.p644b.p651g.p652i.MenuView;
import p636z0.p644b.p653h.TintTypedArray;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements MenuView.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: f */
    public MenuItemImpl f257f;

    /* JADX INFO: renamed from: g */
    public ImageView f258g;

    /* JADX INFO: renamed from: h */
    public RadioButton f259h;

    /* JADX INFO: renamed from: i */
    public TextView f260i;

    /* JADX INFO: renamed from: j */
    public CheckBox f261j;

    /* JADX INFO: renamed from: k */
    public TextView f262k;

    /* JADX INFO: renamed from: l */
    public ImageView f263l;

    /* JADX INFO: renamed from: m */
    public ImageView f264m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f265n;

    /* JADX INFO: renamed from: o */
    public Drawable f266o;

    /* JADX INFO: renamed from: p */
    public int f267p;

    /* JADX INFO: renamed from: q */
    public Context f268q;

    /* JADX INFO: renamed from: r */
    public boolean f269r;

    /* JADX INFO: renamed from: s */
    public Drawable f270s;

    /* JADX INFO: renamed from: t */
    public boolean f271t;

    /* JADX INFO: renamed from: u */
    public LayoutInflater f272u;

    /* JADX INFO: renamed from: v */
    public boolean f273v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f272u == null) {
            this.f272u = LayoutInflater.from(getContext());
        }
        return this.f272u;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f263l;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m152a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f261j = checkBox;
        LinearLayout linearLayout = this.f265n;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f264m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f264m.getLayoutParams();
        rect.top = this.f264m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX INFO: renamed from: b */
    public final void m153b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f259h = radioButton;
        LinearLayout linearLayout = this.f265n;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m154c(boolean z) {
        String string;
        int i = (z && this.f257f.m14804n()) ? 0 : 8;
        if (i == 0) {
            TextView textView = this.f262k;
            MenuItemImpl menuItemImpl = this.f257f;
            char cM14795e = menuItemImpl.m14795e();
            if (cM14795e == 0) {
                string = "";
            } else {
                Resources resources = menuItemImpl.f34863n.f34819b.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(menuItemImpl.f34863n.f34819b).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = menuItemImpl.f34863n.mo14780n() ? menuItemImpl.f34860k : menuItemImpl.f34858i;
                MenuItemImpl.m14793c(sb, i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                MenuItemImpl.m14793c(sb, i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                MenuItemImpl.m14793c(sb, i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                MenuItemImpl.m14793c(sb, i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                MenuItemImpl.m14793c(sb, i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                MenuItemImpl.m14793c(sb, i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (cM14795e == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (cM14795e == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (cM14795e != ' ') {
                    sb.append(cM14795e);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f262k.getVisibility() != i) {
            this.f262k.setVisibility(i);
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuView.a
    /* JADX INFO: renamed from: d */
    public void mo144d(MenuItemImpl menuItemImpl, int i) {
        this.f257f = menuItemImpl;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setTitle(menuItemImpl.f34854e);
        setCheckable(menuItemImpl.isCheckable());
        boolean zM14804n = menuItemImpl.m14804n();
        menuItemImpl.m14795e();
        m154c(zM14804n);
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
        setSubMenuArrowVisible(menuItemImpl.hasSubMenu());
        setContentDescription(menuItemImpl.f34866q);
    }

    @Override // p636z0.p644b.p651g.p652i.MenuView.a
    public MenuItemImpl getItemData() {
        return this.f257f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f266o;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        setBackground(drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f260i = textView;
        int i = this.f267p;
        if (i != -1) {
            textView.setTextAppearance(this.f268q, i);
        }
        this.f262k = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f263l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f270s);
        }
        this.f264m = (ImageView) findViewById(R.id.group_divider);
        this.f265n = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f258g != null && this.f269r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f258g.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f259h == null && this.f261j == null) {
            return;
        }
        if (this.f257f.m14798h()) {
            if (this.f259h == null) {
                m153b();
            }
            compoundButton = this.f259h;
            compoundButton2 = this.f261j;
        } else {
            if (this.f261j == null) {
                m152a();
            }
            compoundButton = this.f261j;
            compoundButton2 = this.f259h;
        }
        if (z) {
            compoundButton.setChecked(this.f257f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f261j;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f259h;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f257f.m14798h()) {
            if (this.f259h == null) {
                m153b();
            }
            compoundButton = this.f259h;
        } else {
            if (this.f261j == null) {
                m152a();
            }
            compoundButton = this.f261j;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f273v = z;
        this.f269r = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f264m;
        if (imageView != null) {
            imageView.setVisibility((this.f271t || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.f257f.f34863n);
        boolean z = this.f273v;
        if (z || this.f269r) {
            ImageView imageView = this.f258g;
            if (imageView == null && drawable == null && !this.f269r) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f258g = imageView2;
                LinearLayout linearLayout = this.f265n;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f269r) {
                this.f258g.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f258g;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f258g.getVisibility() != 0) {
                this.f258g.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f260i.getVisibility() != 8) {
                this.f260i.setVisibility(8);
            }
        } else {
            this.f260i.setText(charSequence);
            if (this.f260i.getVisibility() != 0) {
                this.f260i.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        TintTypedArray tintTypedArrayM14998r = TintTypedArray.m14998r(getContext(), attributeSet, C7463b.f34401q, i, 0);
        this.f266o = tintTypedArrayM14998r.m15005g(5);
        this.f267p = tintTypedArrayM14998r.m15011m(1, -1);
        this.f269r = tintTypedArrayM14998r.m14999a(7, false);
        this.f268q = context;
        this.f270s = tintTypedArrayM14998r.m15005g(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f271t = typedArrayObtainStyledAttributes.hasValue(0);
        tintTypedArrayM14998r.f35267b.recycle();
        typedArrayObtainStyledAttributes.recycle();
    }
}
