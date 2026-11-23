package p007c.p043b.p044a.p045a.p046a.p047c.p048c;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import mtp.media.karaoke.R;
import p007c.p043b.p044a.p045a.p046a.p047c.MenuItem;
import p007c.p043b.p044a.p045a.p046a.p047c.YouTubePlayerMenu;
import p477d1.TypeCastException;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.b.a.a.a.c.c.a, reason: use source file name */
/* JADX INFO: compiled from: DefaultYouTubePlayerMenu.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultYouTubePlayerMenu implements YouTubePlayerMenu {

    /* JADX INFO: renamed from: a */
    public final ArrayList<MenuItem> f1849a;

    /* JADX INFO: renamed from: b */
    public PopupWindow f1850b;

    /* JADX INFO: renamed from: c */
    public final Context f1851c;

    public DefaultYouTubePlayerMenu(Context context) {
        Intrinsics2.m13090f(context, "context");
        this.f1851c = context;
        this.f1849a = new ArrayList<>();
    }

    @Override // p007c.p043b.p044a.p045a.p046a.p047c.YouTubePlayerMenu
    /* JADX INFO: renamed from: a */
    public void mo1313a(View view) {
        Intrinsics2.m13090f(view, "anchorView");
        Object systemService = this.f1851c.getSystemService("layout_inflater");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
        }
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.ayp_player_menu, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycler_view);
        Intrinsics2.m13086b(recyclerView, "recyclerView");
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f1851c));
        recyclerView.setAdapter(new MenuAdapter(this.f1851c, this.f1849a));
        recyclerView.setHasFixedSize(true);
        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
        popupWindow.setContentView(viewInflate);
        popupWindow.setFocusable(true);
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        this.f1850b = popupWindow;
        popupWindow.showAsDropDown(view, (-this.f1851c.getResources().getDimensionPixelSize(R.dimen.ayp_8dp)) * 12, (-this.f1851c.getResources().getDimensionPixelSize(R.dimen.ayp_8dp)) * 12);
        if (this.f1849a.size() == 0) {
            Log.e(YouTubePlayerMenu.class.getName(), "The menu is empty");
        }
    }
}
