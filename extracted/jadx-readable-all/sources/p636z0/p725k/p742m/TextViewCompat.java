package p636z0.p725k.p742m;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: z0.k.m.d, reason: use source file name */
/* JADX INFO: compiled from: TextViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class TextViewCompat implements ActionMode.Callback {

    /* JADX INFO: renamed from: a */
    public final ActionMode.Callback f38129a;

    /* JADX INFO: renamed from: b */
    public final TextView f38130b;

    /* JADX INFO: renamed from: c */
    public Class<?> f38131c;

    /* JADX INFO: renamed from: d */
    public Method f38132d;

    /* JADX INFO: renamed from: e */
    public boolean f38133e;

    /* JADX INFO: renamed from: f */
    public boolean f38134f = false;

    public TextViewCompat(ActionMode.Callback callback, TextView textView) {
        this.f38129a = callback;
        this.f38130b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f38129a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f38129a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f38129a.onDestroyActionMode(actionMode);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        boolean z;
        String str;
        Context context = this.f38130b.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.f38134f) {
            this.f38134f = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f38131c = cls;
                this.f38132d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.f38133e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f38131c = null;
                this.f38132d = null;
                this.f38133e = false;
            }
        }
        try {
            Method declaredMethod = (this.f38133e && this.f38131c.isInstance(menu)) ? this.f38132d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        z = true;
                    } else {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                MenuItem menuItemAdd = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                TextView textView = this.f38130b;
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f38129a.onPrepareActionMode(actionMode, menu);
    }
}
