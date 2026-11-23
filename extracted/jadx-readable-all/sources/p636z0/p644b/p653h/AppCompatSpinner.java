package p636z0.p644b.p653h;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p644b.C7463b;
import p636z0.p644b.p645c.AlertDialog;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p644b.p651g.ContextThemeWrapper;
import p636z0.p644b.p651g.p652i.ShowableListMenu;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.b.h.v, reason: use source file name */
/* JADX INFO: compiled from: AppCompatSpinner.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: f */
    public static final int[] f35210f = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: g */
    public final AppCompatBackgroundHelper f35211g;

    /* JADX INFO: renamed from: h */
    public final Context f35212h;

    /* JADX INFO: renamed from: i */
    public ForwardingListener f35213i;

    /* JADX INFO: renamed from: j */
    public SpinnerAdapter f35214j;

    /* JADX INFO: renamed from: k */
    public final boolean f35215k;

    /* JADX INFO: renamed from: l */
    public g f35216l;

    /* JADX INFO: renamed from: m */
    public int f35217m;

    /* JADX INFO: renamed from: n */
    public final Rect f35218n;

    /* JADX INFO: renamed from: z0.b.h.v$a */
    /* JADX INFO: compiled from: AppCompatSpinner.java */
    public class a extends ForwardingListener {

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ e f35219o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, e eVar) {
            super(view);
            this.f35219o = eVar;
        }

        @Override // p636z0.p644b.p653h.ForwardingListener
        /* JADX INFO: renamed from: b */
        public ShowableListMenu mo147b() {
            return this.f35219o;
        }

        @Override // p636z0.p644b.p653h.ForwardingListener
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: c */
        public boolean mo148c() {
            if (AppCompatSpinner.this.getInternalPopup().mo14970a()) {
                return true;
            }
            AppCompatSpinner.this.m14969b();
            return true;
        }
    }

    /* JADX INFO: renamed from: z0.b.h.v$b */
    /* JADX INFO: compiled from: AppCompatSpinner.java */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo14970a()) {
                AppCompatSpinner.this.m14969b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: renamed from: z0.b.h.v$c */
    /* JADX INFO: compiled from: AppCompatSpinner.java */
    public class c implements g, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: f */
        public AlertDialog f35222f;

        /* JADX INFO: renamed from: g */
        public ListAdapter f35223g;

        /* JADX INFO: renamed from: h */
        public CharSequence f35224h;

        public c() {
        }

        @Override // p636z0.p644b.p653h.AppCompatSpinner.g
        /* JADX INFO: renamed from: a */
        public boolean mo14970a() {
            AlertDialog alertDialog = this.f35222f;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }

        @Override // p636z0.p644b.p653h.AppCompatSpinner.g
        /* JADX INFO: renamed from: c */
        public int mo14971c() {
            return 0;
        }

        @Override // p636z0.p644b.p653h.AppCompatSpinner.g
        public void dismiss() {
            AlertDialog alertDialog = this.f35222f;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.f35222f = null;
            }
        }

        @Override // p636z0.p644b.p653h.AppCompatSpinner.g
        /* JADX INFO: renamed from: e */
        public void mo14972e(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // p636z0.p644b.p653h.AppCompatSpinner.g
        /* JADX INFO: renamed from: f */
        public CharSequence mo14973f() {
            return this.f35224h;
        }

        @Override // p636z0.p644b.p653h.AppCompatSpinner.g
        /* JADX INFO: renamed from: h */
        public Drawable mo14974h() {
            return null;
        }

        @Override // p636z0.p644b.p653h.AppCompatSpinner.g
        /* JADX INFO: renamed from: j */
        public void mo14975j(CharSequence charSequence) {
            this.f35224h = charSequence;
        }

        @Override // p636z0.p644b.p653h.AppCompatSpinner.g
        /* JADX INFO: renamed from: k */
        public void mo14976k(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // p636z0.p644b.p653h.AppCompatSpinner.g
        /* JADX INFO: renamed from: l */
        public void mo14977l(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // p636z0.p644b.p653h.AppCompatSpinner.g
        /* JADX INFO: renamed from: m */
        public void mo14978m(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // p636z0.p644b.p653h.AppCompatSpinner.g
        /* JADX INFO: renamed from: n */
        public void mo14979n(int i, int i2) {
            if (this.f35223g == null) {
                return;
            }
            AlertDialog.a aVar = new AlertDialog.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f35224h;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            ListAdapter listAdapter = this.f35223g;
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            AlertController.C0050b c0050b = aVar.f34424a;
            c0050b.f236n = listAdapter;
            c0050b.f237o = this;
            c0050b.f241s = selectedItemPosition;
            c0050b.f240r = true;
            AlertDialog alertDialogCreate = aVar.create();
            this.f35222f = alertDialogCreate;
            ListView listView = alertDialogCreate.getListView();
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            this.f35222f.show();
        }

        @Override // p636z0.p644b.p653h.AppCompatSpinner.g
        /* JADX INFO: renamed from: o */
        public int mo14980o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.f35223g.getItemId(i));
            }
            AlertDialog alertDialog = this.f35222f;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.f35222f = null;
            }
        }

        @Override // p636z0.p644b.p653h.AppCompatSpinner.g
        /* JADX INFO: renamed from: p */
        public void mo14922p(ListAdapter listAdapter) {
            this.f35223g = listAdapter;
        }
    }

    /* JADX INFO: renamed from: z0.b.h.v$d */
    /* JADX INFO: compiled from: AppCompatSpinner.java */
    public static class d implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: f */
        public SpinnerAdapter f35226f;

        /* JADX INFO: renamed from: g */
        public ListAdapter f35227g;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f35226f = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f35227g = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter2 = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter2.getDropDownViewTheme() == null) {
                        themedSpinnerAdapter2.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f35227g;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f35226f;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f35226f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f35226f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f35226f;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f35226f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f35226f;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f35227g;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f35226f;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f35226f;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: z0.b.h.v$e */
    /* JADX INFO: compiled from: AppCompatSpinner.java */
    public class e extends ListPopupWindow2 implements g {

        /* JADX INFO: renamed from: I */
        public CharSequence f35228I;

        /* JADX INFO: renamed from: J */
        public ListAdapter f35229J;

        /* JADX INFO: renamed from: K */
        public final Rect f35230K;

        /* JADX INFO: renamed from: L */
        public int f35231L;

        /* JADX INFO: renamed from: z0.b.h.v$e$a */
        /* JADX INFO: compiled from: AppCompatSpinner.java */
        public class a implements AdapterView.OnItemClickListener {
            public a(AppCompatSpinner appCompatSpinner) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j2) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    AppCompatSpinner.this.performItemClick(view, i, eVar.f35229J.getItemId(i));
                }
                e.this.dismiss();
            }
        }

        /* JADX INFO: renamed from: z0.b.h.v$e$b */
        /* JADX INFO: compiled from: AppCompatSpinner.java */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                Objects.requireNonNull(eVar);
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                if (!(appCompatSpinner.isAttachedToWindow() && appCompatSpinner.getGlobalVisibleRect(eVar.f35230K))) {
                    e.this.dismiss();
                } else {
                    e.this.m14981t();
                    e.this.mo14750b();
                }
            }
        }

        /* JADX INFO: renamed from: z0.b.h.v$e$c */
        /* JADX INFO: compiled from: AppCompatSpinner.java */
        public class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f35235f;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f35235f = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f35235f);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f35230K = new Rect();
            this.f35109x = AppCompatSpinner.this;
            m14925s(true);
            this.f35107v = 0;
            this.f35110y = new a(AppCompatSpinner.this);
        }

        @Override // p636z0.p644b.p653h.AppCompatSpinner.g
        /* JADX INFO: renamed from: f */
        public CharSequence mo14973f() {
            return this.f35228I;
        }

        @Override // p636z0.p644b.p653h.AppCompatSpinner.g
        /* JADX INFO: renamed from: j */
        public void mo14975j(CharSequence charSequence) {
            this.f35228I = charSequence;
        }

        @Override // p636z0.p644b.p653h.AppCompatSpinner.g
        /* JADX INFO: renamed from: m */
        public void mo14978m(int i) {
            this.f35231L = i;
        }

        @Override // p636z0.p644b.p653h.AppCompatSpinner.g
        /* JADX INFO: renamed from: n */
        public void mo14979n(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean zMo14749a = mo14749a();
            m14981t();
            this.f35093H.setInputMethodMode(2);
            mo14750b();
            DropDownListView dropDownListView = this.f35096k;
            dropDownListView.setChoiceMode(1);
            dropDownListView.setTextDirection(i);
            dropDownListView.setTextAlignment(i2);
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            DropDownListView dropDownListView2 = this.f35096k;
            if (mo14749a() && dropDownListView2 != null) {
                dropDownListView2.setListSelectionHidden(false);
                dropDownListView2.setSelection(selectedItemPosition);
                if (dropDownListView2.getChoiceMode() != 0) {
                    dropDownListView2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zMo14749a || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            this.f35093H.setOnDismissListener(new c(bVar));
        }

        @Override // p636z0.p644b.p653h.ListPopupWindow2, p636z0.p644b.p653h.AppCompatSpinner.g
        /* JADX INFO: renamed from: p */
        public void mo14922p(ListAdapter listAdapter) {
            super.mo14922p(listAdapter);
            this.f35229J = listAdapter;
        }

        /* JADX INFO: renamed from: t */
        public void m14981t() {
            Drawable drawableM14918h = m14918h();
            int i = 0;
            if (drawableM14918h != null) {
                drawableM14918h.getPadding(AppCompatSpinner.this.f35218n);
                i = ViewUtils5.m14875b(AppCompatSpinner.this) ? AppCompatSpinner.this.f35218n.right : -AppCompatSpinner.this.f35218n.left;
            } else {
                Rect rect = AppCompatSpinner.this.f35218n;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i2 = appCompatSpinner.f35217m;
            if (i2 == -2) {
                int iM14968a = appCompatSpinner.m14968a((SpinnerAdapter) this.f35229J, m14918h());
                int i3 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f35218n;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (iM14968a > i4) {
                    iM14968a = i4;
                }
                m14924r(Math.max(iM14968a, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                m14924r((width - paddingLeft) - paddingRight);
            } else {
                m14924r(i2);
            }
            this.f35099n = ViewUtils5.m14875b(AppCompatSpinner.this) ? (((width - paddingRight) - this.f35098m) - this.f35231L) + i : paddingLeft + this.f35231L + i;
        }
    }

    /* JADX INFO: renamed from: z0.b.h.v$f */
    /* JADX INFO: compiled from: AppCompatSpinner.java */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public boolean f35237f;

        /* JADX INFO: renamed from: z0.b.h.v$f$a */
        /* JADX INFO: compiled from: AppCompatSpinner.java */
        public class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f35237f ? (byte) 1 : (byte) 0);
        }

        public f(Parcel parcel) {
            super(parcel);
            this.f35237f = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: renamed from: z0.b.h.v$g */
    /* JADX INFO: compiled from: AppCompatSpinner.java */
    public interface g {
        /* JADX INFO: renamed from: a */
        boolean mo14970a();

        /* JADX INFO: renamed from: c */
        int mo14971c();

        void dismiss();

        /* JADX INFO: renamed from: e */
        void mo14972e(int i);

        /* JADX INFO: renamed from: f */
        CharSequence mo14973f();

        /* JADX INFO: renamed from: h */
        Drawable mo14974h();

        /* JADX INFO: renamed from: j */
        void mo14975j(CharSequence charSequence);

        /* JADX INFO: renamed from: k */
        void mo14976k(Drawable drawable);

        /* JADX INFO: renamed from: l */
        void mo14977l(int i);

        /* JADX INFO: renamed from: m */
        void mo14978m(int i);

        /* JADX INFO: renamed from: n */
        void mo14979n(int i, int i2);

        /* JADX INFO: renamed from: o */
        int mo14980o();

        /* JADX INFO: renamed from: p */
        void mo14922p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX INFO: renamed from: a */
    public int m14968a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f35218n);
        Rect rect = this.f35218n;
        return iMax2 + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: b */
    public void m14969b() {
        this.f35216l.mo14979n(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35211g;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14876a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f35216l;
        return gVar != null ? gVar.mo14971c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f35216l;
        return gVar != null ? gVar.mo14980o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f35216l != null ? this.f35217m : super.getDropDownWidth();
    }

    public final g getInternalPopup() {
        return this.f35216l;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f35216l;
        return gVar != null ? gVar.mo14974h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f35212h;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f35216l;
        return gVar != null ? gVar.mo14973f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35211g;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m14877b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35211g;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m14878c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f35216l;
        if (gVar == null || !gVar.mo14970a()) {
            return;
        }
        this.f35216l.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f35216l == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m14968a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f35237f || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f35216l;
        fVar.f35237f = gVar != null && gVar.mo14970a();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener = this.f35213i;
        if (forwardingListener == null || !forwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f35216l;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.mo14970a()) {
            return true;
        }
        m14969b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35211g;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14880e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35211g;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14881f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        g gVar = this.f35216l;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            gVar.mo14978m(i);
            this.f35216l.mo14972e(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        g gVar = this.f35216l;
        if (gVar != null) {
            gVar.mo14977l(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f35216l != null) {
            this.f35217m = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f35216l;
        if (gVar != null) {
            gVar.mo14976k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AppCompatResources.m14707b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f35216l;
        if (gVar != null) {
            gVar.mo14975j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35211g;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14883h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35211g;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14884i(mode);
        }
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, null, mtp.media.karaoke.R.attr.spinnerStyle, i);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f35215k) {
            this.f35214j = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f35216l != null) {
            Context context = this.f35212h;
            if (context == null) {
                context = getContext();
            }
            this.f35216l.mo14922p(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, mtp.media.karaoke.R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View, android.widget.Spinner, z0.b.h.v] */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        this.f35218n = new Rect();
        ThemeUtils.m14962a(this, getContext());
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C7463b.f34405u, i, 0);
        this.f35211g = new AppCompatBackgroundHelper(this);
        if (theme != null) {
            this.f35212h = new ContextThemeWrapper(context, theme);
        } else {
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
            if (resourceId != 0) {
                this.f35212h = new ContextThemeWrapper(context, resourceId);
            } else {
                this.f35212h = context;
            }
        }
        ?? r12 = -1;
        ?? r2 = 0;
        try {
            if (i2 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f35210f, i, 0);
                    try {
                        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                        r12 = typedArrayObtainStyledAttributes;
                        if (zHasValue) {
                            i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                            r12 = typedArrayObtainStyledAttributes;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        r12 = typedArrayObtainStyledAttributes;
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                        if (i2 != 0) {
                            c cVar = new c();
                            this.f35216l = cVar;
                            cVar.mo14975j(typedArrayObtainStyledAttributes2.getString(2));
                        } else if (i2 == 1) {
                            e eVar = new e(this.f35212h, attributeSet, i);
                            TintTypedArray tintTypedArrayM14998r = TintTypedArray.m14998r(this.f35212h, attributeSet, C7463b.f34405u, i, 0);
                            this.f35217m = tintTypedArrayM14998r.m15010l(3, -2);
                            eVar.f35093H.setBackgroundDrawable(tintTypedArrayM14998r.m15005g(1));
                            eVar.f35228I = typedArrayObtainStyledAttributes2.getString(2);
                            tintTypedArrayM14998r.f35267b.recycle();
                            this.f35216l = eVar;
                            this.f35213i = new a(this, eVar);
                        }
                        textArray = typedArrayObtainStyledAttributes2.getTextArray(0);
                        if (textArray != null) {
                            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                            arrayAdapter.setDropDownViewResource(mtp.media.karaoke.R.layout.support_simple_spinner_dropdown_item);
                            setAdapter(arrayAdapter);
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        this.f35215k = true;
                        spinnerAdapter = this.f35214j;
                        if (spinnerAdapter != null) {
                            setAdapter(spinnerAdapter);
                            this.f35214j = null;
                        }
                        this.f35211g.m14879d(attributeSet, i);
                    }
                } catch (Exception e3) {
                    e = e3;
                    typedArrayObtainStyledAttributes = null;
                } catch (Throwable th) {
                    th = th;
                    if (r2 != 0) {
                        r2.recycle();
                    }
                    throw th;
                }
                r12.recycle();
            }
            if (i2 != 0) {
                c cVar2 = new c();
                this.f35216l = cVar2;
                cVar2.mo14975j(typedArrayObtainStyledAttributes2.getString(2));
            } else if (i2 == 1) {
                e eVar2 = new e(this.f35212h, attributeSet, i);
                TintTypedArray tintTypedArrayM14998r2 = TintTypedArray.m14998r(this.f35212h, attributeSet, C7463b.f34405u, i, 0);
                this.f35217m = tintTypedArrayM14998r2.m15010l(3, -2);
                eVar2.f35093H.setBackgroundDrawable(tintTypedArrayM14998r2.m15005g(1));
                eVar2.f35228I = typedArrayObtainStyledAttributes2.getString(2);
                tintTypedArrayM14998r2.f35267b.recycle();
                this.f35216l = eVar2;
                this.f35213i = new a(this, eVar2);
            }
            textArray = typedArrayObtainStyledAttributes2.getTextArray(0);
            if (textArray != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                arrayAdapter2.setDropDownViewResource(mtp.media.karaoke.R.layout.support_simple_spinner_dropdown_item);
                setAdapter(arrayAdapter2);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f35215k = true;
            spinnerAdapter = this.f35214j;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f35214j = null;
            }
            this.f35211g.m14879d(attributeSet, i);
        } catch (Throwable th2) {
            th = th2;
            r2 = r12;
        }
    }
}
