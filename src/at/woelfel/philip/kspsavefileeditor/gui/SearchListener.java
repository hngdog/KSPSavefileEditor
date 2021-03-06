package at.woelfel.philip.kspsavefileeditor.gui;

import at.woelfel.philip.kspsavefileeditor.backend.TreeBaseNode;

import java.util.List;

public interface SearchListener {
	void onSearchComplete(String term, List<TreeBaseNode> found, GoToHandler handler);

	void onSearchStart(String term);
}
