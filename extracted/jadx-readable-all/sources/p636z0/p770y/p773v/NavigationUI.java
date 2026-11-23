package p636z0.p770y.p773v;

import android.view.MenuItem;
import androidx.navigation.NavController;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import mtp.media.karaoke.R;
import p636z0.p770y.ActivityNavigator;
import p636z0.p770y.NavDestination;
import p636z0.p770y.NavGraph;
import p636z0.p770y.NavOptions;

/* JADX INFO: renamed from: z0.y.v.a, reason: use source file name */
/* JADX INFO: compiled from: NavigationUI.java */
/* JADX INFO: loaded from: classes.dex */
public class NavigationUI implements BottomNavigationView.InterfaceC5922c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NavController f39103a;

    public NavigationUI(NavController navController) {
        this.f39103a = navController;
    }

    @Override // com.google.android.material.bottomnavigation.BottomNavigationView.InterfaceC5922c
    /* JADX INFO: renamed from: a */
    public boolean mo12730a(MenuItem menuItem) {
        NavController navController = this.f39103a;
        NavOptions.a aVar = new NavOptions.a();
        aVar.f39061a = true;
        if (navController.m448c().f39032g.m16913s(menuItem.getItemId()) instanceof ActivityNavigator.a) {
            aVar.f39064d = R.anim.nav_default_enter_anim;
            aVar.f39065e = R.anim.nav_default_exit_anim;
            aVar.f39066f = R.anim.nav_default_pop_enter_anim;
            aVar.f39067g = R.anim.nav_default_pop_exit_anim;
        } else {
            aVar.f39064d = R.animator.nav_default_enter_anim;
            aVar.f39065e = R.animator.nav_default_exit_anim;
            aVar.f39066f = R.animator.nav_default_pop_enter_anim;
            aVar.f39067g = R.animator.nav_default_pop_exit_anim;
        }
        if ((menuItem.getOrder() & 196608) == 0) {
            NavDestination navDestinationM16913s = navController.f833d;
            if (navDestinationM16913s == null) {
                throw new IllegalStateException("You must call setGraph() before calling getGraph()");
            }
            while (navDestinationM16913s instanceof NavGraph) {
                NavGraph navGraph = (NavGraph) navDestinationM16913s;
                navDestinationM16913s = navGraph.m16913s(navGraph.f39045o);
            }
            aVar.f39062b = navDestinationM16913s.f39033h;
            aVar.f39063c = false;
        }
        try {
            navController.m449d(menuItem.getItemId(), null, aVar.m16919a());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
