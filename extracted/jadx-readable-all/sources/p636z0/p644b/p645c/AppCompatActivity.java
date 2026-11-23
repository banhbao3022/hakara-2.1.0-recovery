package p636z0.p644b.p645c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import mtp.media.karaoke.R;
import p636z0.p637a.p638d.ContextAwareHelper;
import p636z0.p637a.p638d.OnContextAvailableListener;
import p636z0.p644b.p651g.ActionMode;
import p636z0.p644b.p653h.VectorEnabledTintResources;
import p636z0.p654b0.SavedStateRegistry;
import p636z0.p691g.ArraySet2;
import p636z0.p725k.C8162a;
import p636z0.p725k.p726c.ActivityCompat;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: z0.b.c.h, reason: use source file name */
/* JADX INFO: compiled from: AppCompatActivity.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements AppCompatCallback {

    /* JADX INFO: renamed from: t */
    public AppCompatDelegate f34426t;

    /* JADX INFO: renamed from: z0.b.c.h$a */
    /* JADX INFO: compiled from: AppCompatActivity.java */
    public class a implements SavedStateRegistry.b {
        public a() {
        }

        @Override // p636z0.p654b0.SavedStateRegistry.b
        /* JADX INFO: renamed from: a */
        public Bundle mo867a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.m14609H().mo14630p(bundle);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: z0.b.c.h$b */
    /* JADX INFO: compiled from: AppCompatActivity.java */
    public class b implements OnContextAvailableListener {
        public b() {
        }

        @Override // p636z0.p637a.p638d.OnContextAvailableListener
        /* JADX INFO: renamed from: a */
        public void mo14491a(Context context) {
            AppCompatDelegate appCompatDelegateM14609H = AppCompatActivity.this.m14609H();
            appCompatDelegateM14609H.mo14623i();
            appCompatDelegateM14609H.mo14626l(AppCompatActivity.this.f140i.f35301b.m15018a("androidx:appcompat"));
        }
    }

    public AppCompatActivity() {
        m14612K();
    }

    /* JADX INFO: renamed from: B */
    private void m14607B() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // p636z0.p752p.p753c.FragmentActivity
    /* JADX INFO: renamed from: G */
    public void mo14608G() {
        m14609H().mo14624j();
    }

    /* JADX INFO: renamed from: H */
    public AppCompatDelegate m14609H() {
        if (this.f34426t == null) {
            ArraySet2<WeakReference<AppCompatDelegate>> arraySet2 = AppCompatDelegate.f34429f;
            this.f34426t = new AppCompatDelegateImpl(this, null, this, this);
        }
        return this.f34426t;
    }

    /* JADX INFO: renamed from: I */
    public ActionBar m14610I() {
        return m14609H().mo14622h();
    }

    /* JADX INFO: renamed from: J */
    public Intent m14611J() {
        return C8162a.m16080y(this);
    }

    /* JADX INFO: renamed from: K */
    public final void m14612K() {
        this.f140i.f35301b.m15019b("androidx:appcompat", new a());
        b bVar = new b();
        ContextAwareHelper contextAwareHelper = this.f138g;
        if (contextAwareHelper.f34170b != null) {
            bVar.mo14491a(contextAwareHelper.f34170b);
        }
        contextAwareHelper.f34169a.add(bVar);
    }

    /* JADX INFO: renamed from: L */
    public void m14613L() {
    }

    /* JADX INFO: renamed from: M */
    public void m14614M() {
    }

    /* JADX INFO: renamed from: N */
    public void m14615N(Toolbar toolbar) {
        m14609H().mo14637x(toolbar);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m14607B();
        m14609H().mo14617c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(m14609H().mo14618d(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar actionBarM14610I = m14610I();
        if (getWindow().hasFeature(0)) {
            if (actionBarM14610I == null || !actionBarM14610I.mo14581a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p636z0.p725k.p726c.ComponentActivity2, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar actionBarM14610I = m14610I();
        if (keyCode == 82 && actionBarM14610I != null && actionBarM14610I.mo14590j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) m14609H().mo14619e(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m14609H().mo14621g();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        int i = VectorEnabledTintResources.f35001a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m14609H().mo14624j();
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m14609H().mo14625k(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m14609H().mo14627m();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if ((Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentM16080y;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar actionBarM14610I = m14610I();
        if (menuItem.getItemId() != 16908332 || actionBarM14610I == null || (actionBarM14610I.mo14584d() & 4) == 0 || (intentM16080y = C8162a.m16080y(this)) == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentM16080y)) {
            navigateUpTo(intentM16080y);
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Intent intentM14611J = m14611J();
        if (intentM14611J == null) {
            intentM14611J = C8162a.m16080y(this);
        }
        if (intentM14611J != null) {
            ComponentName component = intentM14611J.getComponent();
            if (component == null) {
                component = intentM14611J.resolveActivity(getPackageManager());
            }
            int size = arrayList.size();
            try {
                Intent intentM16081z = C8162a.m16081z(this, component);
                while (intentM16081z != null) {
                    arrayList.add(size, intentM16081z);
                    intentM16081z = C8162a.m16081z(this, intentM16081z.getComponent());
                }
                arrayList.add(intentM14611J);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
        m14614M();
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Object obj = ContextCompat.f37815a;
        ContextCompat.a.m16135a(this, intentArr, null);
        try {
            int i2 = ActivityCompat.f37660b;
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m14609H().mo14628n(bundle);
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m14609H().mo14629o();
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        m14609H().mo14631q();
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        m14609H().mo14632r();
    }

    @Override // p636z0.p644b.p645c.AppCompatCallback
    public void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // p636z0.p644b.p645c.AppCompatCallback
    public void onSupportActionModeStarted(ActionMode actionMode) {
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m14609H().mo14639z(charSequence);
    }

    @Override // p636z0.p644b.p645c.AppCompatCallback
    public ActionMode onWindowStartingSupportActionMode(ActionMode.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionBar actionBarM14610I = m14610I();
        if (getWindow().hasFeature(0)) {
            if (actionBarM14610I == null || !actionBarM14610I.mo14591k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        m14607B();
        m14609H().mo14634u(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        m14609H().mo14638y(i);
    }

    public AppCompatActivity(int i) {
        super(i);
        m14612K();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        m14607B();
        m14609H().mo14635v(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m14607B();
        m14609H().mo14636w(view, layoutParams);
    }
}
