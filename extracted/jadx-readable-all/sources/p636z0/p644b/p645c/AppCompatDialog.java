package p636z0.p644b.p645c;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import mtp.media.karaoke.R;
import p636z0.p644b.p651g.ActionMode;
import p636z0.p691g.ArraySet2;
import p636z0.p725k.p739l.KeyEventDispatcher;

/* JADX INFO: renamed from: z0.b.c.p, reason: use source file name */
/* JADX INFO: compiled from: AppCompatDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatDialog extends Dialog implements AppCompatCallback {
    private AppCompatDelegate mDelegate;
    private final KeyEventDispatcher.a mKeyDispatcher;

    /* JADX INFO: renamed from: z0.b.c.p$a */
    /* JADX INFO: compiled from: AppCompatDialog.java */
    public class a implements KeyEventDispatcher.a {
        public a() {
        }

        @Override // p636z0.p725k.p739l.KeyEventDispatcher.a
        /* JADX INFO: renamed from: u */
        public boolean mo14678u(KeyEvent keyEvent) {
            return AppCompatDialog.this.superDispatchKeyEvent(keyEvent);
        }
    }

    public AppCompatDialog(Context context) {
        this(context, 0);
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo14617c(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().mo14627m();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return KeyEventDispatcher.m16290b(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().mo14619e(i);
    }

    public AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            ArraySet2<WeakReference<AppCompatDelegate>> arraySet2 = AppCompatDelegate.f34429f;
            this.mDelegate = new AppCompatDelegateImpl(getContext(), getWindow(), this, this);
        }
        return this.mDelegate;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo14622h();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().mo14624j();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().mo14623i();
        super.onCreate(bundle);
        getDelegate().mo14626l(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().mo14632r();
    }

    @Override // p636z0.p644b.p645c.AppCompatCallback
    public void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // p636z0.p644b.p645c.AppCompatCallback
    public void onSupportActionModeStarted(ActionMode actionMode) {
    }

    @Override // p636z0.p644b.p645c.AppCompatCallback
    public ActionMode onWindowStartingSupportActionMode(ActionMode.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        getDelegate().mo14634u(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo14639z(charSequence);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo14633t(i);
    }

    public AppCompatDialog(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new a();
        AppCompatDelegate delegate = getDelegate();
        delegate.mo14638y(getThemeResId(context, i));
        delegate.mo14626l(null);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        getDelegate().mo14635v(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo14636w(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().mo14639z(getContext().getString(i));
    }

    public AppCompatDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.mKeyDispatcher = new a();
    }
}
