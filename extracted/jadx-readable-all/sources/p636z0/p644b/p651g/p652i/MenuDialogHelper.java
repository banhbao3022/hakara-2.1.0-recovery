package p636z0.p644b.p651g.p652i;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p636z0.p644b.p645c.AlertDialog;

/* JADX INFO: renamed from: z0.b.g.i.h, reason: use source file name */
/* JADX INFO: compiled from: MenuDialogHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class MenuDialogHelper implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, MenuPresenter.a {

    /* JADX INFO: renamed from: f */
    public MenuBuilder f34843f;

    /* JADX INFO: renamed from: g */
    public AlertDialog f34844g;

    /* JADX INFO: renamed from: h */
    public ListMenuPresenter f34845h;

    public MenuDialogHelper(MenuBuilder menuBuilder) {
        this.f34843f = menuBuilder;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter.a
    /* JADX INFO: renamed from: c */
    public void mo186c(MenuBuilder menuBuilder, boolean z) {
        AlertDialog alertDialog;
        if ((z || menuBuilder == this.f34843f) && (alertDialog = this.f34844g) != null) {
            alertDialog.dismiss();
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuPresenter.a
    /* JADX INFO: renamed from: d */
    public boolean mo187d(MenuBuilder menuBuilder) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f34843f.m14784r(((ListMenuPresenter.a) this.f34845h.m14763a()).getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        ListMenuPresenter listMenuPresenter = this.f34845h;
        MenuBuilder menuBuilder = this.f34843f;
        MenuPresenter.a aVar = listMenuPresenter.f34808l;
        if (aVar != null) {
            aVar.mo186c(menuBuilder, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f34844g.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f34844g.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f34843f.m14769c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f34843f.performShortcut(i, keyEvent, 0);
    }
}
