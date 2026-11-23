package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.C7462a;
import p636z0.p644b.C7463b;
import p636z0.p644b.p651g.CollapsibleActionView;
import p636z0.p644b.p653h.AppCompatAutoCompleteTextView;
import p636z0.p644b.p653h.LinearLayoutCompat;
import p636z0.p644b.p653h.SuggestionsAdapter;
import p636z0.p644b.p653h.TintTypedArray;
import p636z0.p644b.p653h.ViewUtils5;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p743l.p744a.CursorAdapter;
import p636z0.p745m.p746a.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements CollapsibleActionView {

    /* JADX INFO: renamed from: u */
    public static final C0081n f366u;

    /* JADX INFO: renamed from: A */
    public final ImageView f367A;

    /* JADX INFO: renamed from: B */
    public final ImageView f368B;

    /* JADX INFO: renamed from: C */
    public final ImageView f369C;

    /* JADX INFO: renamed from: D */
    public final View f370D;

    /* JADX INFO: renamed from: E */
    public C0083p f371E;

    /* JADX INFO: renamed from: F */
    public Rect f372F;

    /* JADX INFO: renamed from: G */
    public Rect f373G;

    /* JADX INFO: renamed from: H */
    public int[] f374H;

    /* JADX INFO: renamed from: I */
    public int[] f375I;

    /* JADX INFO: renamed from: J */
    public final ImageView f376J;

    /* JADX INFO: renamed from: K */
    public final Drawable f377K;

    /* JADX INFO: renamed from: L */
    public final int f378L;

    /* JADX INFO: renamed from: M */
    public final int f379M;

    /* JADX INFO: renamed from: N */
    public final Intent f380N;

    /* JADX INFO: renamed from: O */
    public final Intent f381O;

    /* JADX INFO: renamed from: P */
    public final CharSequence f382P;

    /* JADX INFO: renamed from: Q */
    public InterfaceC0079l f383Q;

    /* JADX INFO: renamed from: R */
    public InterfaceC0078k f384R;

    /* JADX INFO: renamed from: S */
    public View.OnFocusChangeListener f385S;

    /* JADX INFO: renamed from: T */
    public InterfaceC0080m f386T;

    /* JADX INFO: renamed from: U */
    public View.OnClickListener f387U;

    /* JADX INFO: renamed from: V */
    public boolean f388V;

    /* JADX INFO: renamed from: W */
    public boolean f389W;

    /* JADX INFO: renamed from: a0 */
    public CursorAdapter f390a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f391b0;

    /* JADX INFO: renamed from: c0 */
    public CharSequence f392c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f393d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f394e0;

    /* JADX INFO: renamed from: f0 */
    public int f395f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f396g0;

    /* JADX INFO: renamed from: h0 */
    public CharSequence f397h0;

    /* JADX INFO: renamed from: i0 */
    public CharSequence f398i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f399j0;

    /* JADX INFO: renamed from: k0 */
    public int f400k0;

    /* JADX INFO: renamed from: l0 */
    public SearchableInfo f401l0;

    /* JADX INFO: renamed from: m0 */
    public Bundle f402m0;

    /* JADX INFO: renamed from: n0 */
    public final Runnable f403n0;

    /* JADX INFO: renamed from: o0 */
    public Runnable f404o0;

    /* JADX INFO: renamed from: p0 */
    public final WeakHashMap<String, Drawable.ConstantState> f405p0;

    /* JADX INFO: renamed from: q0 */
    public final View.OnClickListener f406q0;

    /* JADX INFO: renamed from: r0 */
    public View.OnKeyListener f407r0;

    /* JADX INFO: renamed from: s0 */
    public final TextView.OnEditorActionListener f408s0;

    /* JADX INFO: renamed from: t0 */
    public final AdapterView.OnItemClickListener f409t0;

    /* JADX INFO: renamed from: u0 */
    public final AdapterView.OnItemSelectedListener f410u0;

    /* JADX INFO: renamed from: v */
    public final SearchAutoComplete f411v;

    /* JADX INFO: renamed from: v0 */
    public TextWatcher f412v0;

    /* JADX INFO: renamed from: w */
    public final View f413w;

    /* JADX INFO: renamed from: x */
    public final View f414x;

    /* JADX INFO: renamed from: y */
    public final View f415y;

    /* JADX INFO: renamed from: z */
    public final ImageView f416z;

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: i */
        public int f417i;

        /* JADX INFO: renamed from: j */
        public SearchView f418j;

        /* JADX INFO: renamed from: k */
        public boolean f419k;

        /* JADX INFO: renamed from: l */
        public final Runnable f420l;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class RunnableC0067a implements Runnable {
            public RunnableC0067a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f419k) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f419k = false;
                }
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* JADX INFO: renamed from: a */
        public void m214a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0081n c0081n = SearchView.f366u;
            Objects.requireNonNull(c0081n);
            C0081n.m220a();
            Method method = c0081n.f434c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f417i <= 0 || super.enoughToFilter();
        }

        @Override // p636z0.p644b.p653h.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f419k) {
                removeCallbacks(this.f420l);
                post(this.f420l);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f418j;
            searchView.m200H(searchView.f389W);
            searchView.post(searchView.f403n0);
            if (searchView.f411v.hasFocus()) {
                searchView.m206s();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f418j.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f418j.hasFocus() && getVisibility() == 0) {
                this.f419k = true;
                Context context = getContext();
                C0081n c0081n = SearchView.f366u;
                if (context.getResources().getConfiguration().orientation == 2) {
                    m214a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f419k = false;
                removeCallbacks(this.f420l);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f419k = true;
                    return;
                }
                this.f419k = false;
                removeCallbacks(this.f420l);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f418j = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f417i = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f420l = new RunnableC0067a();
            this.f417i = getThreshold();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$a */
    public class C0068a implements TextWatcher {
        public C0068a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f411v.getText();
            searchView.f398i0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.m199G(z);
            searchView.m201I(!z);
            searchView.m195C();
            searchView.m198F();
            if (searchView.f383Q != null && !TextUtils.equals(charSequence, searchView.f397h0)) {
                searchView.f383Q.mo216j(charSequence.toString());
            }
            searchView.f397h0 = charSequence.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$b */
    public class RunnableC0069b implements Runnable {
        public RunnableC0069b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m196D();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$c */
    public class RunnableC0070c implements Runnable {
        public RunnableC0070c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CursorAdapter cursorAdapter = SearchView.this.f390a0;
            if (cursorAdapter instanceof SuggestionsAdapter) {
                cursorAdapter.mo14953a(null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$d */
    public class ViewOnFocusChangeListenerC0071d implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC0071d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f385S;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$e */
    public class ViewOnLayoutChangeListenerC0072e implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0072e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int dimensionPixelSize;
            SearchView searchView = SearchView.this;
            if (searchView.f370D.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f414x.getPaddingLeft();
                Rect rect = new Rect();
                boolean zM14875b = ViewUtils5.m14875b(searchView);
                if (searchView.f388V) {
                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                } else {
                    dimensionPixelSize = 0;
                }
                searchView.f411v.getDropDownBackground().getPadding(rect);
                searchView.f411v.setDropDownHorizontalOffset(zM14875b ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.f411v.setDropDownWidth((((searchView.f370D.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$f */
    public class ViewOnClickListenerC0073f implements View.OnClickListener {
        public ViewOnClickListenerC0073f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f416z) {
                searchView.m212y();
                return;
            }
            if (view == searchView.f368B) {
                searchView.m208u();
                return;
            }
            if (view == searchView.f367A) {
                searchView.m213z();
                return;
            }
            if (view != searchView.f369C) {
                if (view == searchView.f411v) {
                    searchView.m206s();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.f401l0;
            if (searchableInfo == null) {
                return;
            }
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.m205r(searchView.f381O, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.f380N);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$g */
    public class ViewOnKeyListenerC0074g implements View.OnKeyListener {
        public ViewOnKeyListenerC0074g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f401l0 == null) {
                return false;
            }
            if (searchView.f411v.isPopupShowing() && SearchView.this.f411v.getListSelection() != -1) {
                return SearchView.this.m193A(i, keyEvent);
            }
            if ((TextUtils.getTrimmedLength(SearchView.this.f411v.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m207t(0, null, searchView2.f411v.getText().toString());
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$h */
    public class C0075h implements TextView.OnEditorActionListener {
        public C0075h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m213z();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$i */
    public class C0076i implements AdapterView.OnItemClickListener {
        public C0076i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j2) {
            SearchView.this.m209v(i);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$j */
    public class C0077j implements AdapterView.OnItemSelectedListener {
        public C0077j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j2) {
            SearchView.this.m210w(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$k */
    public interface InterfaceC0078k {
        /* JADX INFO: renamed from: a */
        boolean m215a();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$l */
    public interface InterfaceC0079l {
        /* JADX INFO: renamed from: j */
        boolean mo216j(String str);

        /* JADX INFO: renamed from: p */
        boolean mo217p(String str);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$m */
    public interface InterfaceC0080m {
        /* JADX INFO: renamed from: a */
        boolean m218a(int i);

        /* JADX INFO: renamed from: b */
        boolean m219b(int i);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$n */
    public static class C0081n {

        /* JADX INFO: renamed from: a */
        public Method f432a;

        /* JADX INFO: renamed from: b */
        public Method f433b;

        /* JADX INFO: renamed from: c */
        public Method f434c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C0081n() {
            this.f432a = null;
            this.f433b = null;
            this.f434c = null;
            m220a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f432a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f433b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f434c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m220a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C0082o extends AbsSavedState {
        public static final Parcelable.Creator<C0082o> CREATOR = new a();

        /* JADX INFO: renamed from: h */
        public boolean f435h;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$o$a */
        public class a implements Parcelable.ClassLoaderCreator<C0082o> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0082o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0082o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0082o[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0082o(parcel, null);
            }
        }

        public C0082o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("SearchView.SavedState{");
            sbM1556G.append(Integer.toHexString(System.identityHashCode(this)));
            sbM1556G.append(" isIconified=");
            sbM1556G.append(this.f435h);
            sbM1556G.append("}");
            return sbM1556G.toString();
        }

        @Override // p636z0.p745m.p746a.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f38150g, i);
            parcel.writeValue(Boolean.valueOf(this.f435h));
        }

        public C0082o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f435h = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$p */
    public static class C0083p extends TouchDelegate {

        /* JADX INFO: renamed from: a */
        public final View f436a;

        /* JADX INFO: renamed from: b */
        public final Rect f437b;

        /* JADX INFO: renamed from: c */
        public final Rect f438c;

        /* JADX INFO: renamed from: d */
        public final Rect f439d;

        /* JADX INFO: renamed from: e */
        public final int f440e;

        /* JADX INFO: renamed from: f */
        public boolean f441f;

        public C0083p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f440e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f437b = new Rect();
            this.f439d = new Rect();
            this.f438c = new Rect();
            m221a(rect, rect2);
            this.f436a = view;
        }

        /* JADX INFO: renamed from: a */
        public void m221a(Rect rect, Rect rect2) {
            this.f437b.set(rect);
            this.f439d.set(rect);
            Rect rect3 = this.f439d;
            int i = this.f440e;
            rect3.inset(-i, -i);
            this.f438c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f441f;
                    if (z2 && !this.f439d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else if (action != 3) {
                    z = true;
                    z3 = false;
                } else {
                    z2 = this.f441f;
                    this.f441f = false;
                }
                z3 = z2;
                z = true;
            } else if (this.f437b.contains(x, y)) {
                this.f441f = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.f438c.contains(x, y)) {
                Rect rect = this.f438c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(this.f436a.getWidth() / 2, this.f436a.getHeight() / 2);
            }
            return this.f436a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f366u = Build.VERSION.SDK_INT < 29 ? new C0081n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f411v.setText(charSequence);
        this.f411v.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* JADX INFO: renamed from: A */
    public boolean m193A(int i, KeyEvent keyEvent) {
        if (this.f401l0 != null && this.f390a0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return m209v(this.f411v.getListSelection());
            }
            if (i == 21 || i == 22) {
                this.f411v.setSelection(i == 21 ? 0 : this.f411v.length());
                this.f411v.setListSelection(0);
                this.f411v.clearListSelection();
                this.f411v.m214a();
                return true;
            }
            if (i != 19 || this.f411v.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    public void m194B(CharSequence charSequence, boolean z) {
        this.f411v.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f411v;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f398i0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m213z();
    }

    /* JADX INFO: renamed from: C */
    public final void m195C() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f411v.getText());
        if (!z2 && (!this.f388V || this.f399j0)) {
            z = false;
        }
        this.f368B.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f368B.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m196D() {
        int[] iArr = this.f411v.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f414x.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f415y.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: E */
    public final void m197E() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f411v;
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        CharSequence charSequence2 = charSequence;
        if (this.f388V && this.f377K != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            this.f377K.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f377K), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    /* JADX INFO: renamed from: F */
    public final void m198F() {
        int i = 0;
        if (!((this.f391b0 || this.f396g0) && !this.f389W) || (this.f367A.getVisibility() != 0 && this.f369C.getVisibility() != 0)) {
            i = 8;
        }
        this.f415y.setVisibility(i);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0021  */
    /* JADX INFO: renamed from: G */
    public final void m199G(boolean z) {
        boolean z2 = this.f391b0;
        int i = 0;
        if (z2) {
            if (!((z2 || this.f396g0) && !this.f389W) || !hasFocus() || (!z && this.f396g0)) {
                i = 8;
            }
        } else {
            i = 8;
        }
        this.f367A.setVisibility(i);
    }

    /* JADX INFO: renamed from: H */
    public final void m200H(boolean z) {
        this.f389W = z;
        int i = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f411v.getText());
        this.f416z.setVisibility(i);
        m199G(z2);
        this.f413w.setVisibility(z ? 8 : 0);
        this.f376J.setVisibility((this.f376J.getDrawable() == null || this.f388V) ? 8 : 0);
        m195C();
        m201I(!z2);
        m198F();
    }

    /* JADX INFO: renamed from: I */
    public final void m201I(boolean z) {
        int i = 8;
        if (this.f396g0 && !this.f389W && z) {
            this.f367A.setVisibility(8);
            i = 0;
        }
        this.f369C.setVisibility(i);
    }

    @Override // p636z0.p644b.p651g.CollapsibleActionView
    /* JADX INFO: renamed from: c */
    public void mo202c() {
        if (this.f399j0) {
            return;
        }
        this.f399j0 = true;
        int imeOptions = this.f411v.getImeOptions();
        this.f400k0 = imeOptions;
        this.f411v.setImeOptions(imeOptions | 33554432);
        this.f411v.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f394e0 = true;
        super.clearFocus();
        this.f411v.clearFocus();
        this.f411v.setImeVisibility(false);
        this.f394e0 = false;
    }

    @Override // p636z0.p644b.p651g.CollapsibleActionView
    /* JADX INFO: renamed from: e */
    public void mo203e() {
        m194B("", false);
        clearFocus();
        m200H(true);
        this.f411v.setImeOptions(this.f400k0);
        this.f399j0 = false;
    }

    public int getImeOptions() {
        return this.f411v.getImeOptions();
    }

    public int getInputType() {
        return this.f411v.getInputType();
    }

    public int getMaxWidth() {
        return this.f395f0;
    }

    public CharSequence getQuery() {
        return this.f411v.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f392c0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f401l0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f382P : getContext().getText(this.f401l0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f379M;
    }

    public int getSuggestionRowLayout() {
        return this.f378L;
    }

    public CursorAdapter getSuggestionsAdapter() {
        return this.f390a0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f403n0);
        post(this.f404o0);
        super.onDetachedFromWindow();
    }

    @Override // p636z0.p644b.p653h.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f411v;
            Rect rect = this.f372F;
            searchAutoComplete.getLocationInWindow(this.f374H);
            getLocationInWindow(this.f375I);
            int[] iArr = this.f374H;
            int i5 = iArr[1];
            int[] iArr2 = this.f375I;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.f373G;
            Rect rect3 = this.f372F;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            C0083p c0083p = this.f371E;
            if (c0083p != null) {
                c0083p.m221a(this.f373G, this.f372F);
                return;
            }
            C0083p c0083p2 = new C0083p(this.f373G, this.f372F, this.f411v);
            this.f371E = c0083p2;
            setTouchDelegate(c0083p2);
        }
    }

    @Override // p636z0.p644b.p653h.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.f389W) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f395f0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f395f0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f395f0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0082o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0082o c0082o = (C0082o) parcelable;
        super.onRestoreInstanceState(c0082o.f38150g);
        m200H(c0082o.f435h);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0082o c0082o = new C0082o(super.onSaveInstanceState());
        c0082o.f435h = this.f389W;
        return c0082o;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f403n0);
    }

    /* JADX INFO: renamed from: q */
    public final Intent m204q(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f398i0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f402m0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f401l0.getSearchActivity());
        return intent;
    }

    /* JADX INFO: renamed from: r */
    public final Intent m205r(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f402m0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.f394e0 || !isFocusable()) {
            return false;
        }
        if (this.f389W) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f411v.requestFocus(i, rect);
        if (zRequestFocus) {
            m200H(false);
        }
        return zRequestFocus;
    }

    /* JADX INFO: renamed from: s */
    public void m206s() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f411v.refreshAutoCompleteResults();
            return;
        }
        C0081n c0081n = f366u;
        SearchAutoComplete searchAutoComplete = this.f411v;
        Objects.requireNonNull(c0081n);
        C0081n.m220a();
        Method method = c0081n.f432a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        C0081n c0081n2 = f366u;
        SearchAutoComplete searchAutoComplete2 = this.f411v;
        Objects.requireNonNull(c0081n2);
        C0081n.m220a();
        Method method2 = c0081n2.f433b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f402m0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m208u();
        } else {
            m212y();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f388V == z) {
            return;
        }
        this.f388V = z;
        m200H(z);
        m197E();
    }

    public void setImeOptions(int i) {
        this.f411v.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f411v.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f395f0 = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0078k interfaceC0078k) {
        this.f384R = interfaceC0078k;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f385S = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0079l interfaceC0079l) {
        this.f383Q = interfaceC0079l;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f387U = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0080m interfaceC0080m) {
        this.f386T = interfaceC0080m;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f392c0 = charSequence;
        m197E();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f393d0 = z;
        CursorAdapter cursorAdapter = this.f390a0;
        if (cursorAdapter instanceof SuggestionsAdapter) {
            ((SuggestionsAdapter) cursorAdapter).f35187w = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z;
        this.f401l0 = searchableInfo;
        Intent intent = null;
        if (searchableInfo != null) {
            this.f411v.setThreshold(searchableInfo.getSuggestThreshold());
            this.f411v.setImeOptions(this.f401l0.getImeOptions());
            int inputType = this.f401l0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f401l0.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            this.f411v.setInputType(inputType);
            CursorAdapter cursorAdapter = this.f390a0;
            if (cursorAdapter != null) {
                cursorAdapter.mo14953a(null);
            }
            if (this.f401l0.getSuggestAuthority() != null) {
                SuggestionsAdapter suggestionsAdapter = new SuggestionsAdapter(getContext(), this, this.f401l0, this.f405p0);
                this.f390a0 = suggestionsAdapter;
                this.f411v.setAdapter(suggestionsAdapter);
                ((SuggestionsAdapter) this.f390a0).f35187w = this.f393d0 ? 2 : 1;
            }
            m197E();
        }
        SearchableInfo searchableInfo2 = this.f401l0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f401l0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f380N;
            } else if (this.f401l0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f381O;
            }
            z = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.f396g0 = z;
        if (z) {
            this.f411v.setPrivateImeOptions("nm");
        }
        m200H(this.f389W);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f391b0 = z;
        m200H(this.f389W);
    }

    public void setSuggestionsAdapter(CursorAdapter cursorAdapter) {
        this.f390a0 = cursorAdapter;
        this.f411v.setAdapter(cursorAdapter);
    }

    /* JADX INFO: renamed from: t */
    public void m207t(int i, String str, String str2) {
        getContext().startActivity(m204q("android.intent.action.SEARCH", null, null, str2, i, null));
    }

    /* JADX INFO: renamed from: u */
    public void m208u() {
        if (!TextUtils.isEmpty(this.f411v.getText())) {
            this.f411v.setText("");
            this.f411v.requestFocus();
            this.f411v.setImeVisibility(true);
        } else if (this.f388V) {
            InterfaceC0078k interfaceC0078k = this.f384R;
            if (interfaceC0078k == null || !interfaceC0078k.m215a()) {
                clearFocus();
                m200H(true);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public boolean m209v(int i) {
        int position;
        String strM14952q;
        InterfaceC0080m interfaceC0080m = this.f386T;
        if (interfaceC0080m != null && interfaceC0080m.m219b(i)) {
            return false;
        }
        Cursor cursor = this.f390a0.f38137h;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentM204q = null;
            try {
                int i2 = SuggestionsAdapter.f35177q;
                String strM14952q2 = SuggestionsAdapter.m14952q(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strM14952q2 == null) {
                    strM14952q2 = this.f401l0.getSuggestIntentAction();
                }
                if (strM14952q2 == null) {
                    strM14952q2 = "android.intent.action.SEARCH";
                }
                String str = strM14952q2;
                String strM14952q3 = SuggestionsAdapter.m14952q(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strM14952q3 == null) {
                    strM14952q3 = this.f401l0.getSuggestIntentData();
                }
                if (strM14952q3 != null && (strM14952q = SuggestionsAdapter.m14952q(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strM14952q3 = strM14952q3 + "/" + Uri.encode(strM14952q);
                }
                intentM204q = m204q(str, strM14952q3 == null ? null : Uri.parse(strM14952q3), SuggestionsAdapter.m14952q(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), SuggestionsAdapter.m14952q(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
            } catch (RuntimeException e) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e);
            }
            if (intentM204q != null) {
                try {
                    getContext().startActivity(intentM204q);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intentM204q, e2);
                }
            }
        }
        this.f411v.setImeVisibility(false);
        this.f411v.dismissDropDown();
        return true;
    }

    /* JADX INFO: renamed from: w */
    public boolean m210w(int i) {
        InterfaceC0080m interfaceC0080m = this.f386T;
        if (interfaceC0080m != null && interfaceC0080m.m218a(i)) {
            return false;
        }
        Editable text = this.f411v.getText();
        Cursor cursor = this.f390a0.f38137h;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return true;
        }
        CharSequence charSequenceMo14954b = this.f390a0.mo14954b(cursor);
        if (charSequenceMo14954b != null) {
            setQuery(charSequenceMo14954b);
            return true;
        }
        setQuery(text);
        return true;
    }

    /* JADX INFO: renamed from: x */
    public void m211x(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX INFO: renamed from: y */
    public void m212y() {
        m200H(false);
        this.f411v.requestFocus();
        this.f411v.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f387U;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m213z() {
        Editable text = this.f411v.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0079l interfaceC0079l = this.f383Q;
        if (interfaceC0079l == null || !interfaceC0079l.mo217p(text.toString())) {
            if (this.f401l0 != null) {
                m207t(0, null, text.toString());
            }
            this.f411v.setImeVisibility(false);
            this.f411v.dismissDropDown();
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f372F = new Rect();
        this.f373G = new Rect();
        this.f374H = new int[2];
        this.f375I = new int[2];
        this.f403n0 = new RunnableC0069b();
        this.f404o0 = new RunnableC0070c();
        this.f405p0 = new WeakHashMap<>();
        ViewOnClickListenerC0073f viewOnClickListenerC0073f = new ViewOnClickListenerC0073f();
        this.f406q0 = viewOnClickListenerC0073f;
        this.f407r0 = new ViewOnKeyListenerC0074g();
        C0075h c0075h = new C0075h();
        this.f408s0 = c0075h;
        C0076i c0076i = new C0076i();
        this.f409t0 = c0076i;
        C0077j c0077j = new C0077j();
        this.f410u0 = c0077j;
        this.f412v0 = new C0068a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7463b.f34404t, i, 0);
        TintTypedArray tintTypedArray = new TintTypedArray(context, typedArrayObtainStyledAttributes);
        LayoutInflater.from(context).inflate(tintTypedArray.m15011m(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f411v = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f413w = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f414x = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f415y = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f416z = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f367A = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f368B = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f369C = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f376J = imageView5;
        Drawable drawableM15005g = tintTypedArray.m15005g(10);
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        viewFindViewById.setBackground(drawableM15005g);
        viewFindViewById2.setBackground(tintTypedArray.m15005g(14));
        imageView.setImageDrawable(tintTypedArray.m15005g(13));
        imageView2.setImageDrawable(tintTypedArray.m15005g(7));
        imageView3.setImageDrawable(tintTypedArray.m15005g(4));
        imageView4.setImageDrawable(tintTypedArray.m15005g(16));
        imageView5.setImageDrawable(tintTypedArray.m15005g(13));
        this.f377K = tintTypedArray.m15005g(12);
        C7462a.m14578o(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f378L = tintTypedArray.m15011m(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f379M = tintTypedArray.m15011m(5, 0);
        imageView.setOnClickListener(viewOnClickListenerC0073f);
        imageView3.setOnClickListener(viewOnClickListenerC0073f);
        imageView2.setOnClickListener(viewOnClickListenerC0073f);
        imageView4.setOnClickListener(viewOnClickListenerC0073f);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0073f);
        searchAutoComplete.addTextChangedListener(this.f412v0);
        searchAutoComplete.setOnEditorActionListener(c0075h);
        searchAutoComplete.setOnItemClickListener(c0076i);
        searchAutoComplete.setOnItemSelectedListener(c0077j);
        searchAutoComplete.setOnKeyListener(this.f407r0);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0071d());
        setIconifiedByDefault(tintTypedArray.m14999a(8, true));
        int iM15004f = tintTypedArray.m15004f(1, -1);
        if (iM15004f != -1) {
            setMaxWidth(iM15004f);
        }
        this.f382P = tintTypedArray.m15013o(6);
        this.f392c0 = tintTypedArray.m15013o(11);
        int iM15008j = tintTypedArray.m15008j(3, -1);
        if (iM15008j != -1) {
            setImeOptions(iM15008j);
        }
        int iM15008j2 = tintTypedArray.m15008j(2, -1);
        if (iM15008j2 != -1) {
            setInputType(iM15008j2);
        }
        setFocusable(tintTypedArray.m14999a(0, true));
        typedArrayObtainStyledAttributes.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f380N = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f381O = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f370D = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0072e());
        }
        m200H(this.f388V);
        m197E();
    }
}
