package p007c.p190n.p194b.p334e.p338c0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p636z0.p644b.p653h.AppCompatAutoCompleteTextView;
import p636z0.p644b.p653h.ListPopupWindow2;

/* JADX INFO: renamed from: c.n.b.e.c0.o, reason: use source file name */
/* JADX INFO: compiled from: MaterialAutoCompleteTextView.java */
/* JADX INFO: loaded from: classes.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* JADX INFO: renamed from: i */
    public final ListPopupWindow2 f24893i;

    /* JADX INFO: renamed from: j */
    public final AccessibilityManager f24894j;

    /* JADX INFO: renamed from: k */
    public final Rect f24895k;

    /* JADX INFO: renamed from: c.n.b.e.c0.o$a */
    /* JADX INFO: compiled from: MaterialAutoCompleteTextView.java */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j2) {
            Object item;
            if (i < 0) {
                ListPopupWindow2 listPopupWindow2 = MaterialAutoCompleteTextView.this.f24893i;
                item = !listPopupWindow2.mo14749a() ? null : listPopupWindow2.f35096k.getSelectedItem();
            } else {
                item = MaterialAutoCompleteTextView.this.getAdapter().getItem(i);
            }
            MaterialAutoCompleteTextView.m11069a(MaterialAutoCompleteTextView.this, item);
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    ListPopupWindow2 listPopupWindow3 = MaterialAutoCompleteTextView.this.f24893i;
                    view = listPopupWindow3.mo14749a() ? listPopupWindow3.f35096k.getSelectedView() : null;
                    ListPopupWindow2 listPopupWindow4 = MaterialAutoCompleteTextView.this.f24893i;
                    i = !listPopupWindow4.mo14749a() ? -1 : listPopupWindow4.f35096k.getSelectedItemPosition();
                    ListPopupWindow2 listPopupWindow5 = MaterialAutoCompleteTextView.this.f24893i;
                    j2 = !listPopupWindow5.mo14749a() ? Long.MIN_VALUE : listPopupWindow5.f35096k.getSelectedItemId();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f24893i.f35096k, view, i, j2);
            }
            MaterialAutoCompleteTextView.this.f24893i.dismiss();
        }
    }

    public MaterialAutoCompleteTextView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m11069a(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
    }

    /* JADX INFO: renamed from: b */
    public final TextInputLayout m11070b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM11070b = m11070b();
        return (textInputLayoutM11070b == null || !textInputLayoutM11070b.f29115F) ? super.getHint() : textInputLayoutM11070b.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM11070b = m11070b();
        if (textInputLayoutM11070b != null && textInputLayoutM11070b.f29115F && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM11070b = m11070b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM11070b != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ListPopupWindow2 listPopupWindow2 = this.f24893i;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !listPopupWindow2.mo14749a() ? -1 : listPopupWindow2.f35096k.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM11070b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable drawableM14918h = this.f24893i.m14918h();
                if (drawableM14918h != null) {
                    drawableM14918h.getPadding(this.f24895k);
                    Rect rect = this.f24895k;
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM11070b.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f24893i.mo14922p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f24894j;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f24893i.mo14750b();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.m11090a(context, attributeSet, i, 0), attributeSet, i);
        this.f24895k = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM11347d = ThemeEnforcement.m11347d(context2, attributeSet, C4801b.f24767v, i, 2132017780, new int[0]);
        if (typedArrayM11347d.hasValue(0) && typedArrayM11347d.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f24894j = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow2 listPopupWindow2 = new ListPopupWindow2(context2);
        this.f24893i = listPopupWindow2;
        listPopupWindow2.m14925s(true);
        listPopupWindow2.f35109x = this;
        listPopupWindow2.f35093H.setInputMethodMode(2);
        listPopupWindow2.mo14922p(getAdapter());
        listPopupWindow2.f35110y = new a();
        typedArrayM11347d.recycle();
    }
}
