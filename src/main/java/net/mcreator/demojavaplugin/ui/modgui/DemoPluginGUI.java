package net.mcreator.demojavaplugin.ui.modgui;

import net.mcreator.demojavaplugin.element.types.DemoPlugin;
import net.mcreator.ui.MCreator;
import net.mcreator.ui.component.util.PanelUtils;
import net.mcreator.ui.init.L10N;
import net.mcreator.ui.modgui.ModElementGUI;
import net.mcreator.ui.validation.AggregatedValidationResult;
import net.mcreator.workspace.elements.ModElement;

import javax.annotation.Nonnull;
import javax.swing.*;
import java.awt.*;

public class DemoPluginGUI extends ModElementGUI<DemoPlugin> {
    public DemoPluginGUI(MCreator mcreator, @Nonnull ModElement modElement, boolean editingMode) {
        super(mcreator, modElement, editingMode);
    }

    @Override
    protected void initGUI() {
        JPanel pane1 = new JPanel(new BorderLayout(10, 10));
        JPanel page1Panel = new JPanel(new GridLayout(1, 2, 10, 10));
        pane1.setOpaque(false);
        page1Panel.setOpaque(false);

        page1Panel.add(L10N.label("elementgui.new_element.new_label"));
        page1Panel.add(L10N.label("elementgui.new_element.second_label"));
        pane1.add("Center", PanelUtils.totalCenterInPanel(page1Panel));

        addPage(L10N.t("elementgui.new_element.page1"), pane1);
    }

    @Override
    protected AggregatedValidationResult validatePage(int i) {
        return null;
    }

    @Override
    protected void openInEditingMode(DemoPlugin demoPlugin) {

    }

    @Override
    public DemoPlugin getElementFromGUI() {
        return null;
    }
}
