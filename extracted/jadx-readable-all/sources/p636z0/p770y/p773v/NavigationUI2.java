package p636z0.p770y.p773v;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.navigation.NavController;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.ref.WeakReference;
import p636z0.p770y.NavDestination;

/* JADX INFO: renamed from: z0.y.v.b, reason: use source file name */
/* JADX INFO: compiled from: NavigationUI.java */
/* JADX INFO: loaded from: classes.dex */
public class NavigationUI2 implements NavController.InterfaceC0136b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WeakReference f39104a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NavController f39105b;

    public NavigationUI2(WeakReference weakReference, NavController navController) {
        this.f39104a = weakReference;
        this.f39105b = navController;
    }

    @Override // androidx.navigation.NavController.InterfaceC0136b
    /* JADX INFO: renamed from: a */
    public void mo456a(NavController navController, NavDestination navDestination, Bundle bundle) {
        int i;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) this.f39104a.get();
        if (bottomNavigationView == null) {
            this.f39105b.f841l.remove(this);
            return;
        }
        Menu menu = bottomNavigationView.getMenu();
        int size = menu.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = menu.getItem(i2);
            int itemId = item.getItemId();
            NavDestination navDestination2 = navDestination;
            do {
                i = navDestination2.f39033h;
                if (i == itemId) {
                    break;
                } else {
                    navDestination2 = navDestination2.f39032g;
                }
            } while (navDestination2 != null);
            if (i == itemId) {
                item.setChecked(true);
            }
        }
    }
}
