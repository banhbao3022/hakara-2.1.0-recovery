package p636z0.p644b.p653h;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.facebook.stetho.websocket.CloseCodes;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p636z0.p644b.C7463b;
import p636z0.p644b.p651g.p652i.ShowableListMenu;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.b.h.k0, reason: use source file name */
/* JADX INFO: compiled from: ListPopupWindow.java */
/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow2 implements ShowableListMenu {

    /* JADX INFO: renamed from: f */
    public static Method f35083f;

    /* JADX INFO: renamed from: g */
    public static Method f35084g;

    /* JADX INFO: renamed from: h */
    public static Method f35085h;

    /* JADX INFO: renamed from: A */
    public final d f35086A;

    /* JADX INFO: renamed from: B */
    public final c f35087B;

    /* JADX INFO: renamed from: C */
    public final a f35088C;

    /* JADX INFO: renamed from: D */
    public final Handler f35089D;

    /* JADX INFO: renamed from: E */
    public final Rect f35090E;

    /* JADX INFO: renamed from: F */
    public Rect f35091F;

    /* JADX INFO: renamed from: G */
    public boolean f35092G;

    /* JADX INFO: renamed from: H */
    public PopupWindow f35093H;

    /* JADX INFO: renamed from: i */
    public Context f35094i;

    /* JADX INFO: renamed from: j */
    public ListAdapter f35095j;

    /* JADX INFO: renamed from: k */
    public DropDownListView f35096k;

    /* JADX INFO: renamed from: l */
    public int f35097l;

    /* JADX INFO: renamed from: m */
    public int f35098m;

    /* JADX INFO: renamed from: n */
    public int f35099n;

    /* JADX INFO: renamed from: o */
    public int f35100o;

    /* JADX INFO: renamed from: p */
    public int f35101p;

    /* JADX INFO: renamed from: q */
    public boolean f35102q;

    /* JADX INFO: renamed from: r */
    public boolean f35103r;

    /* JADX INFO: renamed from: s */
    public boolean f35104s;

    /* JADX INFO: renamed from: t */
    public int f35105t;

    /* JADX INFO: renamed from: u */
    public int f35106u;

    /* JADX INFO: renamed from: v */
    public int f35107v;

    /* JADX INFO: renamed from: w */
    public DataSetObserver f35108w;

    /* JADX INFO: renamed from: x */
    public View f35109x;

    /* JADX INFO: renamed from: y */
    public AdapterView.OnItemClickListener f35110y;

    /* JADX INFO: renamed from: z */
    public final e f35111z;

    /* JADX INFO: renamed from: z0.b.h.k0$a */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = ListPopupWindow2.this.f35096k;
            if (dropDownListView != null) {
                dropDownListView.setListSelectionHidden(true);
                dropDownListView.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: z0.b.h.k0$b */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow2.this.mo14749a()) {
                ListPopupWindow2.this.mo14750b();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow2.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: z0.b.h.k0$c */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1) {
                if ((ListPopupWindow2.this.f35093H.getInputMethodMode() == 2) || ListPopupWindow2.this.f35093H.getContentView() == null) {
                    return;
                }
                ListPopupWindow2 listPopupWindow2 = ListPopupWindow2.this;
                listPopupWindow2.f35089D.removeCallbacks(listPopupWindow2.f35111z);
                ListPopupWindow2.this.f35111z.run();
            }
        }
    }

    /* JADX INFO: renamed from: z0.b.h.k0$d */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow2.this.f35093H) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow2.this.f35093H.getWidth() && y >= 0 && y < ListPopupWindow2.this.f35093H.getHeight()) {
                ListPopupWindow2 listPopupWindow2 = ListPopupWindow2.this;
                listPopupWindow2.f35089D.postDelayed(listPopupWindow2.f35111z, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            ListPopupWindow2 listPopupWindow3 = ListPopupWindow2.this;
            listPopupWindow3.f35089D.removeCallbacks(listPopupWindow3.f35111z);
            return false;
        }
    }

    /* JADX INFO: renamed from: z0.b.h.k0$e */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = ListPopupWindow2.this.f35096k;
            if (dropDownListView != null) {
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                if (!dropDownListView.isAttachedToWindow() || ListPopupWindow2.this.f35096k.getCount() <= ListPopupWindow2.this.f35096k.getChildCount()) {
                    return;
                }
                int childCount = ListPopupWindow2.this.f35096k.getChildCount();
                ListPopupWindow2 listPopupWindow2 = ListPopupWindow2.this;
                if (childCount <= listPopupWindow2.f35106u) {
                    listPopupWindow2.f35093H.setInputMethodMode(2);
                    ListPopupWindow2.this.mo14750b();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f35083f = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f35085h = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f35084g = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow2(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    @Override // p636z0.p644b.p651g.p652i.ShowableListMenu
    /* JADX INFO: renamed from: a */
    public boolean mo14749a() {
        return this.f35093H.isShowing();
    }

    @Override // p636z0.p644b.p651g.p652i.ShowableListMenu
    /* JADX INFO: renamed from: b */
    public void mo14750b() {
        int i;
        int maxAvailableHeight;
        int iMakeMeasureSpec;
        int paddingBottom;
        DropDownListView dropDownListView;
        if (this.f35096k == null) {
            DropDownListView dropDownListViewMo14923q = mo14923q(this.f35094i, !this.f35092G);
            this.f35096k = dropDownListViewMo14923q;
            dropDownListViewMo14923q.setAdapter(this.f35095j);
            this.f35096k.setOnItemClickListener(this.f35110y);
            this.f35096k.setFocusable(true);
            this.f35096k.setFocusableInTouchMode(true);
            this.f35096k.setOnItemSelectedListener(new ListPopupWindow(this));
            this.f35096k.setOnScrollListener(this.f35087B);
            this.f35093H.setContentView(this.f35096k);
        }
        Drawable background = this.f35093H.getBackground();
        if (background != null) {
            background.getPadding(this.f35090E);
            Rect rect = this.f35090E;
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f35102q) {
                this.f35100o = -i2;
            }
        } else {
            this.f35090E.setEmpty();
            i = 0;
        }
        boolean z = this.f35093H.getInputMethodMode() == 2;
        View view = this.f35109x;
        int i3 = this.f35100o;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f35084g;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(this.f35093H, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    maxAvailableHeight = this.f35093H.getMaxAvailableHeight(view, i3);
                }
            } else {
                maxAvailableHeight = this.f35093H.getMaxAvailableHeight(view, i3);
            }
        } else {
            maxAvailableHeight = this.f35093H.getMaxAvailableHeight(view, i3, z);
        }
        if (this.f35097l == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i4 = this.f35098m;
            if (i4 == -2) {
                int i5 = this.f35094i.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.f35090E;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5 - (rect2.left + rect2.right), Integer.MIN_VALUE);
            } else if (i4 != -1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else {
                int i6 = this.f35094i.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f35090E;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6 - (rect3.left + rect3.right), 1073741824);
            }
            int iM14889a = this.f35096k.m14889a(iMakeMeasureSpec, maxAvailableHeight - 0, -1);
            paddingBottom = iM14889a + (iM14889a > 0 ? this.f35096k.getPaddingBottom() + this.f35096k.getPaddingTop() + i + 0 : 0);
        }
        boolean z2 = this.f35093H.getInputMethodMode() == 2;
        C8162a.m16051V(this.f35093H, this.f35101p);
        if (this.f35093H.isShowing()) {
            View view2 = this.f35109x;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (view2.isAttachedToWindow()) {
                int width = this.f35098m;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f35109x.getWidth();
                }
                int i7 = this.f35097l;
                if (i7 == -1) {
                    if (!z2) {
                        paddingBottom = -1;
                    }
                    if (z2) {
                        this.f35093H.setWidth(this.f35098m == -1 ? -1 : 0);
                        this.f35093H.setHeight(0);
                    } else {
                        this.f35093H.setWidth(this.f35098m == -1 ? -1 : 0);
                        this.f35093H.setHeight(-1);
                    }
                } else if (i7 != -2) {
                    paddingBottom = i7;
                }
                this.f35093H.setOutsideTouchable(true);
                this.f35093H.update(this.f35109x, this.f35099n, this.f35100o, width < 0 ? -1 : width, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.f35098m;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f35109x.getWidth();
        }
        int i8 = this.f35097l;
        if (i8 == -1) {
            paddingBottom = -1;
        } else if (i8 != -2) {
            paddingBottom = i8;
        }
        this.f35093H.setWidth(width2);
        this.f35093H.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f35083f;
            if (method2 != null) {
                try {
                    method2.invoke(this.f35093H, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f35093H.setIsClippedToScreen(true);
        }
        this.f35093H.setOutsideTouchable(true);
        this.f35093H.setTouchInterceptor(this.f35086A);
        if (this.f35104s) {
            C8162a.m16045P(this.f35093H, this.f35103r);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f35085h;
            if (method3 != null) {
                try {
                    method3.invoke(this.f35093H, this.f35091F);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.f35093H.setEpicenterBounds(this.f35091F);
        }
        this.f35093H.showAsDropDown(this.f35109x, this.f35099n, this.f35100o, this.f35105t);
        this.f35096k.setSelection(-1);
        if ((!this.f35092G || this.f35096k.isInTouchMode()) && (dropDownListView = this.f35096k) != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
        if (this.f35092G) {
            return;
        }
        this.f35089D.post(this.f35088C);
    }

    /* JADX INFO: renamed from: c */
    public int m14916c() {
        return this.f35099n;
    }

    @Override // p636z0.p644b.p651g.p652i.ShowableListMenu
    public void dismiss() {
        this.f35093H.dismiss();
        this.f35093H.setContentView(null);
        this.f35096k = null;
        this.f35089D.removeCallbacks(this.f35111z);
    }

    /* JADX INFO: renamed from: e */
    public void m14917e(int i) {
        this.f35099n = i;
    }

    /* JADX INFO: renamed from: h */
    public Drawable m14918h() {
        return this.f35093H.getBackground();
    }

    @Override // p636z0.p644b.p651g.p652i.ShowableListMenu
    /* JADX INFO: renamed from: i */
    public ListView mo14755i() {
        return this.f35096k;
    }

    /* JADX INFO: renamed from: k */
    public void m14919k(Drawable drawable) {
        this.f35093H.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: l */
    public void m14920l(int i) {
        this.f35100o = i;
        this.f35102q = true;
    }

    /* JADX INFO: renamed from: o */
    public int m14921o() {
        if (this.f35102q) {
            return this.f35100o;
        }
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public void mo14922p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f35108w;
        if (dataSetObserver == null) {
            this.f35108w = new b();
        } else {
            ListAdapter listAdapter2 = this.f35095j;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f35095j = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f35108w);
        }
        DropDownListView dropDownListView = this.f35096k;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.f35095j);
        }
    }

    /* JADX INFO: renamed from: q */
    public DropDownListView mo14923q(Context context, boolean z) {
        return new DropDownListView(context, z);
    }

    /* JADX INFO: renamed from: r */
    public void m14924r(int i) {
        Drawable background = this.f35093H.getBackground();
        if (background == null) {
            this.f35098m = i;
            return;
        }
        background.getPadding(this.f35090E);
        Rect rect = this.f35090E;
        this.f35098m = rect.left + rect.right + i;
    }

    /* JADX INFO: renamed from: s */
    public void m14925s(boolean z) {
        this.f35092G = z;
        this.f35093H.setFocusable(z);
    }

    public ListPopupWindow2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow2(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow2(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f35097l = -2;
        this.f35098m = -2;
        this.f35101p = CloseCodes.PROTOCOL_ERROR;
        this.f35105t = 0;
        this.f35106u = Integer.MAX_VALUE;
        this.f35107v = 0;
        this.f35111z = new e();
        this.f35086A = new d();
        this.f35087B = new c();
        this.f35088C = new a();
        this.f35090E = new Rect();
        this.f35094i = context;
        this.f35089D = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7463b.f34398n, i, i2);
        this.f35099n = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f35100o = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f35102q = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.f35093H = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
